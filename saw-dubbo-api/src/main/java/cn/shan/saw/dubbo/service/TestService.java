package cn.shan.saw.dubbo.service;

import cn.shan.saw.dubbo.model.User;

/**
 * Created by shanlehong on 2018/3/15.
 */
public interface TestService {
    String sayHello(String str);

    User findUser();
}
