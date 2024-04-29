package com.vishnu.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL)
public class Jombo {

    @Inject
    private String yut;

    public String getYut() {
        return yut;
    }

    
    
}
