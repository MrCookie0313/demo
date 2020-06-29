package com.sharding.demo.mapper;
 
;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sharding.demo.model.UserInfo;
import org.springframework.stereotype.Repository;
 
/**
 * @Author Lxq
 * @Date 2020/5/4 20:38
 * @Version 1.0
 */
@Repository
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    
}