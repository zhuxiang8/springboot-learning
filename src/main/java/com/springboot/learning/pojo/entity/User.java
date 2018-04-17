package com.springboot.learning.pojo.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;

import java.io.Serializable;
import java.util.List;

/**
 * @Description 用户实体类
 * @Author zhuxiang
 * @Date 2018/4/2 14:29
 */
public class User extends Model<User> {
    /**
     * 主键
     */
    private Long id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 工号
     */
    private String userNum;

    /**
     * 联系方式
     */
    private String phoneNum;

    /**
     * 角色列表
     */
    @TableField(exist = false)
    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getLoginName() {
        return loginName;
    }

    public User setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserNum() {
        return userNum;
    }

    public User setUserNum(String userNum) {
        this.userNum = userNum;
        return this;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public User setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userNum='" + userNum + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", roles=" + roles +
                "} " + super.toString();
    }
}
