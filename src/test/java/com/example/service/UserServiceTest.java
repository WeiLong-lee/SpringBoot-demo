package com.example.service;



import com.example.SpringBootDemoApplication;
import com.example.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

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
    public void testInsert() throws Exception{
        User user = new User();
        user.setUserName("weilong2");
        user.setPassword("123456");
        userService.create(user.getUserName(),user.getPassword());
    }
}
