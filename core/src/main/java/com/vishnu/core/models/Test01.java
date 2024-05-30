package com.vishnu.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Test01 {
   
    @Inject
    private String test;

    @Inject
    private String data;

    public String getTest() {
        return test;
    }

    public String getData() {
        return data;
    }

}
