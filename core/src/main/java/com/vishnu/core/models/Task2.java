package com.vishnu.core.models;

import java.util.List;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = "/apps/vishnu/components/carousel")
public class Task2 {

    @ChildResource
    private List<Test02> multi;

    public List<Test02> getMulti() {
        return multi;
    }

}
