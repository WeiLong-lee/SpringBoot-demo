package com.example.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.swing.*;

/**
 * Created by LiWeilong on 2018/4/20.
 * redis 工具类
 */
public class RedisUtil {

    private RedisTemplate redisTemplate = SpringUtil.getBean(RedisTemplate.class);

    private static StringRedisTemplate stringRedisTemplate = (StringRedisTemplate) SpringUtil.getBean("stringRedisTemplate");


    public static String setValue(String str,String value){
        if(!stringRedisTemplate.hasKey(str)){
              stringRedisTemplate.opsForValue().set(str,value);
              return "使用redis缓存保存数据成功";
        }else{
            return "key已存在";
        }
    }

    public static String getValue(String key){
        if(!stringRedisTemplate.hasKey(key)){
            return "key 不存在";
        }
        return String.valueOf(stringRedisTemplate.opsForValue().get(key));
    }
}
