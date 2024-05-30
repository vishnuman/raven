package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = "/apps/vishnu/components/sidebar")
public class TaskThree {

    @Inject
    private String one;

    @Inject
    private String two;

    @Inject
    private String three;

    @Inject
    private String four;

    @Inject
    private String rat;

    @ChildResource
    private List<TaskThreeOne> packet;


    public List<TaskThreeOne> getPacket() {
        return packet;
    }

    public List<TaskThreeOne> getRacket() {
        return racket;
    }

    @ChildResource
    private List<TaskThreeOne> racket;
    
    public String getRat() {
        return rat;
    }

    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public String getThree() {
        return three;
    }

    public String getFour() {
        return four;
    }
    
}
