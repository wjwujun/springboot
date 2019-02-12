package com.spring.cloud.ribbon.controller;

import com.spring.cloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @GetMapping("sayHi")
    public String sayHi() {
    //public String sayHi(@RequestParam String message) {
        return ribbonService.getPort("rabbion");
    }
}
