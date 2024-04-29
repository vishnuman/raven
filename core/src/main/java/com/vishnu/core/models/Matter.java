package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Matter {
    
     @Inject
    private String vishnu;

    @Inject
    private String jok;

    public String getVishnu() {
        return vishnu;
    }
    public String getJok() {
        return jok;
    }

    @ChildResource
    private List<pot> max;

    public List<pot> getMax() {
        return max;
    }

}
