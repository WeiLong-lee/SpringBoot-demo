package com.example.util.test;

import com.example.SpringBootDemoApplication;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import net.sf.json.JsonConfig;

/**
 * Created by LiWeilong on 2018/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBootDemoApplication.class)
public class RedisTest {

    @Test
    public void SampleMessageQueueTest(){

    }

    @Test
    public void redisUtilTest(){
     /* String result = RedisUtil.setValue("TEST","今天Redis 测试");
      System.out.println("插入结果："+result);
      String value =   RedisUtil.getValue("Ceshi");
      System.out.println("获取结果："+value);
      String result1 = RedisUtil.setValue("2018/05/07 14:26","今天Redis 测试 14:26");
      System.out.println("插入结果："+result1);*/


    }


}
