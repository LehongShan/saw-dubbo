package cn.shan.saw.dubbo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by shanlehong on 2018/3/15.
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
