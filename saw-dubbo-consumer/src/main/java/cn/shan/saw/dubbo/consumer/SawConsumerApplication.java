package cn.shan.saw.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by shanlehong on 2018/3/15.
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class SawConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SawConsumerApplication.class,args);
    }
}
