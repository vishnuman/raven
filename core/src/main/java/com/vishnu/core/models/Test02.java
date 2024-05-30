package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Test02 {
    @Inject
    private String test;

    @Inject
    private String path;

    @ChildResource
    private List<Test002> max;

    public String getTest() {
        return test;
    }

    public String getPath() {
        return path;
    }

    public List<Test002> getMax() {
        return max;
    }

 
}
