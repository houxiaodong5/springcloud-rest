package com.hxd.loginservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaServer
@SpringBootApplication
@MapperScan("com.hxd.loginservice.dao")

public class LoginServiceApplication {
    @Autowired
    private RestTemplateBuilder builder;

    // 使用RestTemplateBuilder来实例化RestTemplate对象，spring默认已经注入了RestTemplateBuilder实例
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return builder.build();
    }

    public static void main(String[] args) {
        SpringApplication.run(LoginServiceApplication.class, args);
    }

}
