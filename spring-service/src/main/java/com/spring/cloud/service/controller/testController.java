package com.spring.cloud.service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Value("${server.port}")
    private int port;

    @GetMapping("getPort")
    public String getPort(@RequestParam(value = "message") String message){
            return String.format("your port  is:%s,  your message is %s",port,message);
    }
}
