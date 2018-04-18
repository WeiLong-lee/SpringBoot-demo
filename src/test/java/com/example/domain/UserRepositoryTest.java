package com.example.domain;

import com.example.SpringBootDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by LiWeilong on 2018/4/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
@WebAppConfiguration
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception{

        User user =userRepository.findByUsernameAndPass("lwl","123456");
        System.out.println(user.toString());
    }
}
