package com.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class PageController {
    @RequestMapping("/index")
    public String page(){
        return "index.html";
    }

}
