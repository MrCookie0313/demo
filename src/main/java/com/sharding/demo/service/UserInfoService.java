package com.sharding.demo.service;
import com.sharding.demo.model.UserInfo;

import java.util.List;
 
/**
 * @Author Lxq
 * @Date 2020/5/4 20:36
 * @Version 1.0
 */
public interface  UserInfoService {
 
    /**
     * 保存用户信息
     * @param entity
     * @return
     */
 
    int save(UserInfo entity);
 
    /**
     * 查询所以用户信息
     * @return
     */
    List<UserInfo> getUserList();
 
    /**
     *
     * @param id
     * @return
     */
    UserInfo selectById(Integer id);
}