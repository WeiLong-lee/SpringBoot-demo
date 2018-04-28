package com.example.service.impl;

import com.example.service.RedisTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by LiWeilong on 2018/4/28.
 */
@Service("redisTemplateService")
public class RedisTemplateServiceImpl implements RedisTemplateService {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public void deleteFromRedis(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public Boolean hashCheckHxists(String hKey, String hashKey) {
        return redisTemplate.opsForHash().hasKey(hKey,hashKey);
    }

    @Override
    public Object hashGet(String hKey, String hashKey) {
        return redisTemplate.opsForHash().get(hKey,hashKey);
    }

    @Override
    public Map<Object, Object> hashGetAll(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    @Override
    public Long hashIncrementLongOfHashMap(String hKey, String hashKey, Long delta) {
        return redisTemplate.opsForHash().increment(hKey,hashKey,delta);
    }

    @Override
    public Double hashIncrementDoubleOfHashMap(String hKey, String hashKey, Double delta) {
        return redisTemplate.opsForHash().increment(hKey,hashKey,delta);
    }

    @Override
    public void hashPushHashMap(String key, Object hashKey, Object value) {
           redisTemplate.opsForHash().put(key,hashKey,value);
    }

    @Override
    public Set<Object> hashGetAllHashKey(String key) {
        return redisTemplate.opsForHash().keys(key);
    }

    @Override
    public Long hashGetHashMapSize(String key) {
        return redisTemplate.opsForHash().size(key);
    }

    @Override
    public List<Object> hashGetHashAllValues(String key) {
        return redisTemplate.opsForHash().values(key);
    }

    @Override
    public Long hashDeleteHashKey(String key, Object... hashKeys) {
        return redisTemplate.opsForHash().delete(key,hashKeys);
    }

    @Override
    public void listRightPushList(String key, String value) {

    }

    @Override
    public String listRightPopList(String key) {
        return null;
    }

    @Override
    public void listLeftPushList(String key, String value) {

    }

    @Override
    public String listLeftPopList(String key) {
        return null;
    }

    @Override
    public Long listSize(String key) {
        return null;
    }

    @Override
    public List<String> listRangeList(String key, Long start, Long end) {
        return null;
    }

    @Override
    public Long listRemoveFromList(String key, long i, Object value) {
        return null;
    }

    @Override
    public String listIndexFromList(String key, long index) {
        return null;
    }

    @Override
    public void listSetValueToList(String key, long index, String value) {

    }

    @Override
    public void listTrimByRange(String key, Long start, Long end) {

    }

    @Override
    public Long setAddSetMap(String key, String... values) {
        return null;
    }

    @Override
    public Long setGetSizeForSetMap(String key) {
        return null;
    }

    @Override
    public Set<String> setGetMemberOfSetMap(String key) {
        return null;
    }

    @Override
    public Boolean setCheckIsMemberOfSet(String key, Object o) {
        return null;
    }

    @Override
    public Integer stringAppendString(String key, String value) {
        return null;
    }

    @Override
    public String stringGetStringByKey(String key) {
        return null;
    }

    @Override
    public String stringGetSubStringFromString(String key, long start, long end) {
        return null;
    }

    @Override
    public Long stringIncrementLongString(String key, Long delta) {
        return null;
    }

    @Override
    public Double stringIncrementDoubleString(String key, Double delta) {
        return null;
    }

    @Override
    public void stringSetString(String key, String value) {

    }

    @Override
    public String stringGetAndSet(String key, String value) {
        return null;
    }

    @Override
    public void stringSetValueAndExpireTime(String key, String value, long timeout) {

    }
}
