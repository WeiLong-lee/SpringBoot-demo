package com.example.util;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.Jedis;

import java.util.List;

/**
 * Created by LiWeilong on 2018/4/28.
 * redis应用场景之存储最新N条聊天记录
 */
@Slf4j
public class SampleMessageQueue {


    static int MAX_MESSAGE_QUEUE = 4;

    public void SaveMessage(Jedis jedis, String userId, String message){
           jedis.lpush(userId,message);
           jedis.ltrim(userId,0,MAX_MESSAGE_QUEUE);
    }

    public void PrintRecentMessage(Jedis jedis,String userId){
        long end = jedis.llen(userId);
        List<String> messageList = jedis.lrange(userId,0,end);
        for(int i =0;i<messageList.size();i++){
            System.out.println(messageList.get(i));
        }
    }

    public void SAMPLE_MessageQueue(){
        String host ="47.94.208.251";
        int port =6379;
        try {
            Jedis jedis = new Jedis(host,port);
            String authString = jedis.auth("weilong1994");
            if(!authString.equals("OK")){
                log.error("AUTH Failed : {}",authString);
                return ;
            }
            String userId = "TEST";
            for(int i=0;i<1000;i++){
                String message = "Hello World "+i+"!";
                SaveMessage(jedis,userId,message);
                PrintRecentMessage(jedis,userId);
            }
            jedis.quit();
            jedis.close();
        }catch (Exception e){
             e.printStackTrace();
        }


    }


}
