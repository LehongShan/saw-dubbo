package cn.shan.saw.dubbo.model;

import lombok.Data;

/**
 * Created by shanlehong on 2018/3/15.
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
}
