package com.sharding.demo.controller;

import com.sharding.demo.config.MyConfig;
import com.sharding.demo.config.MyTestProperties;
import com.sharding.demo.model.UserInfo;
import com.sharding.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
 
/**
 * @Author Lxq
 * @Date 2020/5/4 20:35
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private MyConfig myConfig;
    @Autowired
    private MyTestProperties myTestProperties;
 
    @Autowired
    private UserInfoService userService;
 
    @GetMapping("/select")
    public List<UserInfo> select() {
        return userService.getUserList();
    }
 
    @PostMapping("/insert")
    public int insert(UserInfo user) {
        return userService.save(user);
    }

    @GetMapping("/select/config")
    public void selectConfig() {
        System.out.println(myConfig.getName());
        System.out.println(myConfig.getAge());
        System.out.println("myTestProperties name= " + myTestProperties.getName());
        System.out.println("myTestProperties age= " + myTestProperties.getAge());
    }


}