package cn.shan.saw.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by shanlehong on 2018/3/15.
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
public class SawProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(SawProviderApplication.class,args);
    }
}
