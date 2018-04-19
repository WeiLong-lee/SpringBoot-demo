package com.example.service;

import com.example.domain.User;
import com.example.domain.UserXtp;

import java.util.List;

/**
 * Created by LiWeilong on 2018/4/18.
 */
public interface UserService {

    void create(String name,String pass);
    void deleteByName(String name);
    Integer getAllUsers();
    List<User> getUserListTale();
    List<UserXtp> getUserListXtp();
    void deleteAllUsers();
}
