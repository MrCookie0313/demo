package com.sharding.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/29 0029
 */
@Data
@ConfigurationProperties(prefix = "mytest")
public class MyTestProperties {
    private String name;
    private int age;
}
