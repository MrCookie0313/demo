package com.sharding.demo.model;
 
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
/**
 * @Author Lxq
 * @Date 2020/5/4 20:34
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user_info")
public class UserInfo {
 
    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String userName;
    private int age;
}