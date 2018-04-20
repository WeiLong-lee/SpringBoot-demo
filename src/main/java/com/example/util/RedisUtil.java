package com.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by LiWeilong on 2018/4/20.
 */
public class RedisUtil {

    @Autowired
    private static StringRedisTemplate redisTemplate;

    public static String setValue(String str,Object obj){
        if(!redisTemplate.hasKey(str)){
              redisTemplate.opsForValue().append(str,obj.toString());
              return "使用redis缓存保存数据成功";
        }else{
            return "key已存在";
        }
    }

    public static String getValue(String key){
        if(!redisTemplate.hasKey(key)){
            return "key 不存在";
        }
        return redisTemplate.opsForValue().get(key);
    }
}
