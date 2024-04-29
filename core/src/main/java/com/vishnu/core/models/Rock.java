package com.vishnu.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(
    adaptables = Resource.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class Rock {

    @Inject
    private String text;
    @Inject
    private String deck;
    @Inject
    private double mug;


    public String getText() {
        return text;
    }

    public String getDeck() {
        return deck;
    }

    public double getMug() {
        return mug;
    }


    
}
