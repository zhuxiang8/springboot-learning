package com.springboot.learning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.springboot.learning.pojo.entity.User;

import java.util.List;

/**
 * @Description 用户mapper
 * @Author zhuxiang
 * @Date 2018/4/2 15:03
 */
public interface UserMapper extends BaseMapper<User> {
    List<User> selectPageByMap();
}
