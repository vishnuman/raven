package com.vishnu.core.models;


import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = "/apps/vishnu/components/freecomp")
public class Free {
    @Inject
    private String id;

    @Inject
    private String name;

    @Inject
    private String description;

    @Inject
    private String type;

    @Inject
    private String price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

}
