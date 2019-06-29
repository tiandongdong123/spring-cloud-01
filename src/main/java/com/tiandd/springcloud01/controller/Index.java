package com.tiandd.springcloud01.controller;

import com.tiandd.springcloud01.pojo.master.User;
import com.tiandd.springcloud01.pojo.slave.Product;
import com.tiandd.springcloud01.service.ProductService;
import com.tiandd.springcloud01.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Index {

    @Resource
    private UserService userService;
    @Resource
    private ProductService productService;
    @RequestMapping("/index.html")
    public String index(){
        //主数据库用户表查询
        User user=new User();
        user.setId(1);
        List<User> userList= userService.getUserById(user);
        for (User user1 : userList) {
            System.out.println(user1);
        }
        //从数据库商品表查询
        List<Product> productList=productService.getAllProduct();
        for (Product product1 : productList) {
            System.out.println(product1);
        }

        return "index";
    }
}
