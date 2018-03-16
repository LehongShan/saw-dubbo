package cn.shan.saw.dubbo.service.impl;

import cn.shan.saw.dubbo.service.TestService;
import cn.shan.saw.dubbo.model.User;
import com.alibaba.dubbo.config.annotation.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shanlehong on 2018/3/15.
 */
@Service(version = "1.0.0")
public class TestServiceImpl  implements TestService {
    @Override
    public String sayHello(String str) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(new Date()) + ": " + str;
    }

    @Override
    public User findUser() {
        User user = new User();
        user.setId(1001);
        user.setUsername("scott");
        user.setPassword("tiger");
        user.setAge(20);
        user.setGender(0);
        return user;
    }
}
