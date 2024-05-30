package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = "/apps/vishnu/components/header")
public class Task1 {

    @Inject
    private String text;

    @Inject
    private String path;

    @Inject
    private String check;

     @ChildResource
    private List<Test01> multi;

    public List<Test01> getMulti() {
        return multi;
    }

    public String getText() {
        return text;
    }

    public String getPath() {
        return path;
    }

    public String getCheck() {
        return check;
    }

    



    
}
