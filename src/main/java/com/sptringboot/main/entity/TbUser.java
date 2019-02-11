package com.sptringboot.main.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，加密存储
     */
    private String pwd;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 密码加密的salt值
     */
    private String salt;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码，加密存储
     *
     * @return pwd - 密码，加密存储
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 设置密码，加密存储
     *
     * @param pwd 密码，加密存储
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 获取注册手机号
     *
     * @return phone - 注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置注册手机号
     *
     * @param phone 注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取密码加密的salt值
     *
     * @return salt - 密码加密的salt值
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置密码加密的salt值
     *
     * @param salt 密码加密的salt值
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }
}