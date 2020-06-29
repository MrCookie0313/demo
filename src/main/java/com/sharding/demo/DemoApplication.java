package com.sharding.demo;

import com.sharding.demo.config.ComponentProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.sharding.demo.mapper")
@EnableConfigurationProperties
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//        ComponentProperties bean = context.getBean(ComponentProperties.class);
//        System.out.println("bean = " + bean);
//        context.close();
    }

}
