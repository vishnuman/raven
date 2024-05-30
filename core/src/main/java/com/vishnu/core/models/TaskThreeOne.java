package com.vishnu.core.models;

import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TaskThreeOne {

     @Inject
    private String kon;

    @Inject
    private String dot;

    @Inject
    private String vishnu;

    @Inject
    private String jok;

    @ChildResource
    private List<TaskThreeTwo> max;

    public List<TaskThreeTwo> getMax() {
        return max;
    }

    public String getVishnu() {
        return vishnu;
    }

    public String getJok() {
        return jok;
    }

    public String getKon() {
        return kon;
    }

    public String getDot() {
        return dot;
    }

    public Object getProperty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProperty'");
    }

    
}
