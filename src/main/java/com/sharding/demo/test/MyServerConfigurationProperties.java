package com.sharding.demo.test;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
@Data
@ConfigurationProperties(prefix = "myserver")
public class MyServerConfigurationProperties {
    private int port;
    private String url;
    private String brand;
 
    //省略get set方法    
}