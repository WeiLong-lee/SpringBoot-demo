package com.example.service.impl;
import com.example.domain.User;
import com.example.mapper.UserMapper;
import com.example.domain.UserXtp;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LiWeilong on 2018/4/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(String name, String pass) {
    }

    @Override
    public void deleteByName(String name) {
    }

    @Override
    public Integer getAllUsers() {
        return null;
    }

    @Override
    public List<User> getUserListTale() {
        return userMapper.getUserList();
    }


    @Override
    public List<UserXtp> getUserListXtp() {
        return userMapper.getUserXtpList();
    }

    @Override
    public void deleteAllUsers() {

    }
}
