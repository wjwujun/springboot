package com.sptringboot.main.controller;

import com.sptringboot.main.entity.User;
import com.sptringboot.main.service.TbuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    @Autowired
    private TbuserService tbuserService;

    @GetMapping("")
    public String sayHi(){
        return "ok";
    }

    @GetMapping("index")
    public String index(Model model){
        User user = new User();
        user.setName("hello");
        user.setAge(108);

        model.addAttribute("user",user);
        return "index";
    }
    @GetMapping("find")
    public void testSelect() {
        tbuserService.testSelect();
    }
}
