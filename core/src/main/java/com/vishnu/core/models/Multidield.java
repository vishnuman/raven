package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = "/apps/vishnu/components/japan")
public class Multidield {

    @Inject
    private String text;

    public String getText() {
        return text;
    }
    
     @ChildResource
    public List<Rubber> jin;

    public List<Rubber> getJin() {
        return jin;
    }

    }

    

    

