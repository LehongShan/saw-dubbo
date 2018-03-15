package cn.shan.saw.dubbo.consumer.controller;

import cn.shan.saw.dubbo.service.TestService;
import cn.shan.saw.dubbo.model.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shanlehong on 2018/3/15.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Reference(version = "1.0.0")
    private TestService testService;

    @GetMapping("hello")
    public String hello() {
        return testService.sayHello("Hello springboot and dubbo!");
    }
    @GetMapping("/user")
    public User user(){
        return testService.findUser();
    }
}
