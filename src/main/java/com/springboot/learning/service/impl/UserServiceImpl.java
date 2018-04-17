package com.springboot.learning.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.springboot.learning.mapper.UserMapper;
import com.springboot.learning.pojo.entity.User;
import com.springboot.learning.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description 用户实现类
 * @Author zhuxiang
 * @Date 2018/4/2 15:11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public List<User> selectPageByMap() {
        return baseMapper.selectPageByMap();
    }
}
