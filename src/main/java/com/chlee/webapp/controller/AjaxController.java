package com.chlee.webapp.controller;

import com.chlee.webapp.domain.dto.MessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AjaxController {

    @GetMapping("/chlee/food/get")
    public MessageDto getFoodGet(MessageDto messageDto) {
        System.out.println("getFoodGet");
        System.out.println(messageDto.toString());
        return messageDto;
    }

    @PostMapping("/chlee/food/stringify")
    public MessageDto getFoodPostStringify(@RequestBody MessageDto messageDto) {
        System.out.println("getFoodPost");
        System.out.println(messageDto.toString());
        return messageDto;
    }

    @PostMapping("/chlee/food/json")
    public MessageDto getFoodPostJson(MessageDto messageDto) {
        System.out.println("getFoodPost");
        System.out.println(messageDto.toString());
        return messageDto;
    }

    @PostMapping("/chlee/food/formserialize")
    public MessageDto getFoodPostFormSerialize(MessageDto messageDto) {
        System.out.println("getFoodPostFormSerialize");
        System.out.println(messageDto.toString());
        return messageDto;
    }
}
