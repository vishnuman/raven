package com.vishnu.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;

@Model(
        adaptables = Resource.class,
        adapters = IconModel.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class IconModel {
	
    @SuppressWarnings("unused")
    private static final Logger LOG = LoggerFactory.getLogger(IconModel.class);
    

    @Inject
    private String iconpath;

    @Inject
    private String iconlink;

    @Inject
    private String ctalink;

    @Inject
    private String target;
    

    public String getIconPath() {
        return iconpath;
    }

    public String getIconLink() {
        return iconlink;
    }

    public String getCtaLink() {
        return ctalink;
    }

    public String getTarget() {
        return target;
    }
}
