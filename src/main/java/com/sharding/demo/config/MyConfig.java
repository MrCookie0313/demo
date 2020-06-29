package com.sharding.demo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/29 0029
 */
@Component
@Data
public class MyConfig {

    @Value("${mytest.name}")
    private String name;
    @Value("${mytest.age}")
    private int age;
}
