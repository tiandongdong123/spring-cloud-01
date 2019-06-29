package com.tiandd.springcloud01.config;

import com.tiandd.springcloud01.pojo.Aliyun;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${appKey}")
    private String appKey;
    @Value("${appSecret}")
    private String appSecret;
    @Value("${bucket}")
    private String bucket;
    @Value("${endPoint}")
    private String endPoint;

    @Bean
    public Aliyun aliyun(){
        return Aliyun.options()
                .setAppKey(appKey)
                .setAppSecret(appSecret)
                .setBucket(bucket)
                .setEndPoint(endPoint)
                .build();
    }
}
