package com.hxd.loginservice.dao;

import com.hxd.loginservice.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO {

    User findUser(User user);

}
