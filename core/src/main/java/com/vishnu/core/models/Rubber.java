package com.vishnu.core.models;



import java.util.List;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

@Model(adaptables = Resource.class,defaultInjectionStrategy =DefaultInjectionStrategy.OPTIONAL)
public class Rubber {

    @Inject
    private String iop;

    public String getIop() {
        return iop;
    }

    @ChildResource
    public List<Jombo> iou;

    public List<Jombo> getIou() {
        return iou;
    }   
}
