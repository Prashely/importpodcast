package com.ImportPodcast.website.RESTs;

import org.springframework.stereotype.Controller;

@Controller
public class frontendRest {

    public String indexPage(){
        return "forward:index.html";
    }
}
