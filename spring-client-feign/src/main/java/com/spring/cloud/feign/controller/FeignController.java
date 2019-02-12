package com.spring.cloud.feign.controller;


import com.spring.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @GetMapping("sayHi")
    public String sayHi() {
        //public String sayHi(@RequestParam(value = "message") String message) {
        return feignService.sayHi("Hellofdign");
    }
}
