package com.example.service;

/**
 * Created by LiWeilong on 2018/4/18.
 */
public interface UserService {

    void create(String name,String pass);
    void deleteByName(String name);
    Integer getAllUsers();
    void deleteAllUsers();
}
