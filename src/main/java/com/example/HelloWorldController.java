package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiWeilong on 2018/3/22.
 */

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String Hello(){
        return "Hello World!";
    }
}
