package com.tiandd.springcloud01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        // 禁掉自带的DataSourceAutoConfiguration，因为它会读取application.properties文件的spring.datasource.*属性并自动配置单数据源
        DataSourceAutoConfiguration.class
})
public class SpringCloud01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloud01Application.class, args);
    }
}
