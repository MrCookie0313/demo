package com.sharding.demo.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author sunBing
 * @version 1.0
 * @date 2020/6/29 0029
 */
@Configuration
@EnableConfigurationProperties(MyTestProperties.class)
public class MyTestConfiguration {
}
