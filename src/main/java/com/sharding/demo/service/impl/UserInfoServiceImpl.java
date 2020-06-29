package com.sharding.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sharding.demo.mapper.UserInfoMapper;
import com.sharding.demo.model.UserInfo;
import com.sharding.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 
/**
 * @Author Lxq
 * @Date 2020/5/4 20:37
 * @Version 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
 
 
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public int save(UserInfo entity) {
        return userInfoMapper.insert(entity);
    }
 
    @Override
    public List<UserInfo> getUserList() {
        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*");
        return userInfoMapper.selectList(queryWrapper);
    }
 
    @Override
    public UserInfo selectById(Integer id) {
        return userInfoMapper.selectById(id);
    }
}