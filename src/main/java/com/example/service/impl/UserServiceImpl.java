package com.example.service.impl;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by LiWeilong on 2018/4/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, String pass) {
         jdbcTemplate.update("insert into t_users(username,password) value(?,?)",name,pass);
    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public Integer getAllUsers() {
        return null;
    }

    @Override
    public void deleteAllUsers() {

    }
}
