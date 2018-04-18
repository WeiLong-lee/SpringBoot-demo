package com.example.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by LiWeilong on 2018/4/18.
 */
public interface UserRepository extends JpaRepository<User,Long> {

    //TODO findByuserName   by后面的参数应与实体的属性一致，如果不一致，可以选择添加query，例如 下一个方法findByUsernameAndPass
    User findByuserName(String username);

    /***
     *
     * @param username
     * @param pass
     * @return
     */
    //TODO 注意点：sql中的形参应该是注解@param 标注的，最规范的情况应该是保持一致，避免错误
    @Query("select u from User u where u.userName =:userName and u.password =:password")
    User findByUsernameAndPass(@Param("userName") String username,@Param("password") String pass);
    @Query("select u from User u where u.userName =:userName")
    User findUser(@Param("userName") String userName);

}
