package com.chlee.webapp.controller;

import com.chlee.webapp.domain.dto.MessageDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping("/main")
    public String index(ModelMap map) {
        map.addAttribute("userName", "cheolheeLee");
        return "index";
    }
//  ajax
    @RequestMapping("/chlee")
    public String list(ModelMap map) {
        return "view/ajax/list";
    }

    @PostMapping("/chlee/food")
    public @ResponseBody
    Map<String,Object> getFood(@RequestBody MessageDto messageDto) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("food", messageDto.getFood());
        map.put("price", messageDto.getPrice());
        map.put("maker", messageDto.getMaker());
        return map;
    }
}