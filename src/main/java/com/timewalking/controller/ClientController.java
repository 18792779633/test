package com.timewalking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @RequestMapping("test")
    public String test(){
        System.out.println("hello");
        return "index";
    }
}
