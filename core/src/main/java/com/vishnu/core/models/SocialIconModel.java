package com.vishnu.core.models;


import java.util.ArrayList;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;


@Model(
        adaptables ={SlingHttpServletRequest.class,Resource.class},
        adapters = SocialIconModel.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)

public class SocialIconModel {
	
	@ChildResource
    private List<IconModel> sharingmenu= new ArrayList<>();

    public List<IconModel> getIcons(){
        return sharingmenu;
    }
}
