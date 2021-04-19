package com.chlee.webapp.controller;

import com.chlee.webapp.domain.dto.MessageDto;
import com.chlee.webapp.domain.entity.Customer;
import com.chlee.webapp.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class AjaxController {
    @Autowired
    private CustomerRepository repository;


    @GetMapping("/chlee/customer")
    public List<Customer> getCustomerList()  {
        return (List<Customer>) repository.findAll();
    }

    @GetMapping("/chlee/food/get")
    public MessageDto getFoodGet(MessageDto messageDto)  {
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

    private void encodingCheck(String word) throws UnsupportedEncodingException {
        System.out.println("utf-8 -&gt; euc-kr        : " + new String(word.getBytes("utf-8"), "euc-kr"));
        System.out.println("utf-8 -&gt; ksc5601       : " + new String(word.getBytes("utf-8"), "ksc5601"));
        System.out.println("utf-8 -&gt; x-windows-949 : " + new String(word.getBytes("utf-8"), "x-windows-949"));
        System.out.println("utf-8 -&gt; iso-8859-1    : " + new String(word.getBytes("utf-8"), "iso-8859-1"));
        System.out.println("iso-8859-1 -&gt; euc-kr        : " + new String(word.getBytes("iso-8859-1"), "euc-kr"));
        System.out.println("iso-8859-1 -&gt; ksc5601       : " + new String(word.getBytes("iso-8859-1"), "ksc5601"));
        System.out.println("iso-8859-1 -&gt; x-windows-949 : " + new String(word.getBytes("iso-8859-1"), "x-windows-949"));
        System.out.println("iso-8859-1 -&gt; utf-8         : " + new String(word.getBytes("iso-8859-1"), "utf-8"));
        System.out.println("euc-kr -&gt; utf-8         : " + new String(word.getBytes("euc-kr"), "utf-8"));
        System.out.println("euc-kr -&gt; ksc5601       : " + new String(word.getBytes("euc-kr"), "ksc5601"));
        System.out.println("euc-kr -&gt; x-windows-949 : " + new String(word.getBytes("euc-kr"), "x-windows-949"));
        System.out.println("euc-kr -&gt; iso-8859-1    : " + new String(word.getBytes("euc-kr"), "iso-8859-1"));
        System.out.println("ksc5601 -&gt; euc-kr        : " + new String(word.getBytes("ksc5601"), "euc-kr"));
        System.out.println("ksc5601 -&gt; utf-8         : " + new String(word.getBytes("ksc5601"), "utf-8"));
        System.out.println("ksc5601 -&gt; x-windows-949 : " + new String(word.getBytes("ksc5601"), "x-windows-949"));
        System.out.println("ksc5601 -&gt; iso-8859-1    : " + new String(word.getBytes("ksc5601"), "iso-8859-1"));
        System.out.println("x-windows-949 -&gt; euc-kr     : " + new String(word.getBytes("x-windows-949"), "euc-kr"));
        System.out.println("x-windows-949 -&gt; utf-8      : " + new String(word.getBytes("x-windows-949"), "utf-8"));
        System.out.println("x-windows-949 -&gt; ksc5601    : " + new String(word.getBytes("x-windows-949"), "ksc5601"));
        System.out.println("x-windows-949 -&gt; iso-8859-1 : " + new String(word.getBytes("x-windows-949"), "iso-8859-1"));
    }
}
