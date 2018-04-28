package com.example.util.test;

import com.example.SpringBootDemoApplication;
import com.example.util.SampleMessageQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by LiWeilong on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
@WebAppConfiguration
public class RedisTest {

    @Test
    public void SampleMessageQueueTest(){

        new SampleMessageQueue().SAMPLE_MessageQueue();
    }


}
