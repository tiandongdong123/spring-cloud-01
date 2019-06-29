package com.tiandd.springcloud01.controller;

import com.tiandd.springcloud01.pojo.User;
import com.tiandd.springcloud01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class Index {

    @Resource
    private UserService userService;
    @RequestMapping("/index.html")
    public String index(){
        User user=new User();
        user.setId(1);
        System.out.println(userService.getUserById(user));
        return "index";
    }
}
