package com.vishnu.core.models;



import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Money {

    @Inject
    private String kon;

    @Inject
    private String dot;


    public String getKon() {
        return kon;
    }

    public String getDot() {
        return dot;
    }


   
    
}
