package com.hxd.loginservice.service.impl;

import com.hxd.loginservice.dao.UserDAO;
import com.hxd.loginservice.entity.User;
import com.hxd.loginservice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public Boolean login(User user) {
       /* User dbUser = userDAO.findUser(user);
        if(dbUser!=null&&dbUser.getPassword().equals(user.getPassword())){
            return true;
        }
        return false;*/
       //模拟成功
        return true;
    }
}
