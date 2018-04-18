package com.example.web;

import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiWeilong on 2018/4/18.
 */
@RequestMapping("/user")
@RestController
public class Usercontroller {

    @Autowired
    private UserService userService;


}
