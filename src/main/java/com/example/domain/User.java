package com.example.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by LiWeilong on 2018/4/18.
 */

@Data
@Entity
@Table(name = "t_users")
public class User implements Serializable{

    @Id
    @GeneratedValue
    @Column(name = "uid",nullable = false)
    private Integer uid;
    @Column(name = "username",nullable = false)
    private String userName;
    @Column(name = "password",nullable = false)
    private String password;

}
