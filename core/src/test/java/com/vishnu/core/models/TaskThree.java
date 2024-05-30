package com.vishnu.core.models;

import io.wcm.testing.mock.aem.junit5.AemContext;
import org.apache.sling.api.resource.Resource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TaskThreeTest {

    private final AemContext context = new AemContext();

    private TaskThree taskThree;

    @BeforeEach
    void setUp() {
        context.addModelsForClasses(TaskThree.class, TaskThreeOne.class);

        // Create a test resource with properties and child resources
        Resource resource = context.create().resource("/content/taskThree",
                "one", "valueOne",
                "two", "valueTwo",
                "three", "valueThree",
                "four", "valueFour",
                "rat", "valueRat");

        // Create child resources
        context.create().resource("/content/taskThree/packet/0", "property", "packetItem1");
        context.create().resource("/content/taskThree/packet/1", "property", "packetItem2");
        context.create().resource("/content/taskThree/racket/0", "property", "racketItem1");
        context.create().resource("/content/taskThree/racket/1", "property", "racketItem2");

        // Adapt the resource to the model
        taskThree = resource.adaptTo(TaskThree.class);
    }

    @Test
    void testGetters() {
        assertNotNull(taskThree);
        assertEquals("valueOne", taskThree.getOne());
        assertEquals("valueTwo", taskThree.getTwo());
        assertEquals("valueThree", taskThree.getThree());
        assertEquals("valueFour", taskThree.getFour());
        assertEquals("valueRat", taskThree.getRat());
    }

    @Test
    void testGetPacket() {
        List<TaskThreeOne> packet = taskThree.getPacket();
        assertNotNull(packet);
        assertEquals(2, packet.size());
        assertEquals("packetItem1", packet.get(0).getProperty());
        assertEquals("packetItem2", packet.get(1).getProperty());
    }

    @Test
    void testGetRacket() {
        List<TaskThreeOne> racket = taskThree.getRacket();
        assertNotNull(racket);
        assertEquals(2, racket.size());
        assertEquals("racketItem1", racket.get(0).getProperty());
        assertEquals("racketItem2", racket.get(1).getProperty());
    }
}
