package com.example.mapper;

/**
 * Created by LiWeilong on 2018/4/19.
 *
 */

import com.example.domain.User;
import com.example.domain.UserXtp;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select id,name,password from user where name = #{name}")
    UserXtp getUserXtp(@Param("name") String name);
    @Select("select uid,username,password from t_users where username = #{name}")
    User getUser(@Param("name") String name);
    @Select("select * from user")
    List<UserXtp> getUserXtpList();
    @Select("select * from t_users")
    List<User> getUserList();

}
