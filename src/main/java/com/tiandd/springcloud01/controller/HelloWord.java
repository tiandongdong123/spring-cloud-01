package com.tiandd.springcloud01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public String helloWord(){
        return "hello hello word!!!";
    }
}
