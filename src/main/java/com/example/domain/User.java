package com.example.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by LiWeilong on 2018/4/18.
 */

@Data

public class User implements Serializable{


    private Integer uid;

    private String username;
    private String password;

}
