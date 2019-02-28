package com.hxd.service1.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/l")
    public String login() {
        System.out.println("？？？？？？？？");

        String url = "http://login-service/login/simple";
        LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("id", 1L);
        map.add("password", "123");
        //可设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.add("msg", "Hello");

        HttpEntity<LinkedMultiValueMap<String, Object>> httpEntity = new HttpEntity<>(map, headers);

        //调用服务
        String result ;
        try {
            result = restTemplate.postForObject(url, httpEntity,String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return "服务调用失败！";

        }
        System.out.println(result);
        return result;
    }

    @RequestMapping("/a")
    public void a(){
        System.out.println("AAAAAAAAAAAAA");
    }




}
