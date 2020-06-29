package com.sharding.demo.config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="local")
public class ComponentProperties {

    private String host;
    private String port;

    public void setHost(String host) {
        this.host = host;
    }
    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "ComponentProperties [host=" + host + ", port=" + port + "]";
    }

}