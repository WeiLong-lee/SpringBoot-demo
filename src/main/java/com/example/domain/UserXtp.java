package com.example.domain;

import lombok.Data;
import java.io.Serializable;

/**
 * Created by LiWeilong on 2018/4/19.
 */

@Data
public class UserXtp implements Serializable{

    private Integer id;

    private String name;

    private String password;
}
