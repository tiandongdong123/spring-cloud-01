package com.tiandd.springcloud01.controller;

import com.tiandd.springcloud01.pojo.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @Autowired
    private Aliyun aliyun;

    @RequestMapping("/hello")
    public String helloWord(){
        System.out.println(aliyun.getAppKey());
        System.out.println(aliyun.getAppSecret());
        System.out.println(aliyun.getBucket());
        System.out.println(aliyun.getEndPoint());
        return "hello hello word!!!";
    }
}
