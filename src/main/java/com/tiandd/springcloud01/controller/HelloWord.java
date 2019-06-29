package com.tiandd.springcloud01.controller;

import com.tiandd.springcloud01.pojo.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @Autowired
    private Aliyun aliyun;

    @RequestMapping("/hello")
    public int helloWord(int i){
        System.out.println(aliyun.toString());

        return 1/i;
    }
}
