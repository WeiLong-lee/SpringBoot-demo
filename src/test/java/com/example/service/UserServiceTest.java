package com.example.service;



import com.example.SpringBootDemoApplication;
import com.example.domain.User;
import com.example.domain.UserXtp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by LiWeilong on 2018/4/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Before
    public void setUp(){
        System.out.println("开始测试...");
    }

    @Test
    public void testSelect() throws Exception{
      List<UserXtp> userXtpList =  userService.getUserListXtp();
      //List<User> userList =userService.getUserListTale();

        System.out.println(userXtpList);
        //System.out.println(userList);
    }


}
