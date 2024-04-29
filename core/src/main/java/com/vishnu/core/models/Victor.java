package com.vishnu.core.models;

import java.util.List;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


@Model(adaptables=Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Victor {


    @ChildResource
    private List<Congo> racket;

    public List<Congo> getRacket() {
        return racket;
    }


    }

