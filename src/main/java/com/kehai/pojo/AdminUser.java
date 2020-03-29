package com.kehai.pojo;

import java.io.Serializable;

/**
 * admin_user
 * @author 
 */
public class AdminUser implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String name;

    private String salt;

    private String phone;

    private String email;

    /**
     * 0：未启用
            1：启用
     */
    private Byte status;

    private Long createTime;

    /**
     * 0：普通管理员
            1：超级管理员
     */
    private Byte isSuper;

    private String consumer;

    private String remark;

    private String dept;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Byte getIsSuper() {
        return isSuper;
    }

    public void setIsSuper(Byte isSuper) {
        this.isSuper = isSuper;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}