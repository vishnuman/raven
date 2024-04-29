package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Bag {

    @Inject
    private String kok;

    public String getKok() {
        return kok;
    }

    @ChildResource
    public List<Money> racket;

    public List<Money> getRacket() {
        return racket;
    }

    


    
    
}
