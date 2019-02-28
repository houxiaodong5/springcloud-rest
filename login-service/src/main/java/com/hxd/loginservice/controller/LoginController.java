package com.hxd.loginservice.controller;

import com.hxd.loginservice.entity.User;
import com.hxd.loginservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/simple")
    public String loginByID(@RequestParam String password, @RequestParam Long id, @RequestHeader(required = false) String msg){


        User user = new User();
        user.setId(id);
        user.setPassword(password);
        Boolean flag=loginService.login(user);
        System.out.println("MSG："+msg);
        if(flag){
            return "登陆成功："+user.getId()+"号用户！";
        }
        return "登录失败：请核对您的凭证信息！";
    }

}
