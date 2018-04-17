package com.springboot.learning.controller.web;

import com.springboot.learning.pojo.entity.User;
import com.springboot.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 用户控制器
 * @Author zhuxiang
 * @Date 2018/4/2 15:06
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 查询工具使用次数排行
     *
     * @return
     */
    @PostMapping("create")
    public String insert(@RequestBody @Validated User request) {
        userService.insert(request);
        return "sss";
    }

    /**
     * 查询工具使用次数排行
     *
     * @return
     */
    @PostMapping("find")
    public List<User> list() {
        return userService.selectPageByMap();
    }
}
