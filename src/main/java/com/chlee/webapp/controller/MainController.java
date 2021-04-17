package com.chlee.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("userName", "cheolheeLee");
        return "index";
    }
}