package com.springboot.learning.service;

import com.baomidou.mybatisplus.service.IService;
import com.springboot.learning.pojo.entity.User;

import java.util.List;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/2 15:09
 */
public interface UserService extends IService<User> {
    List<User> selectPageByMap();
}
