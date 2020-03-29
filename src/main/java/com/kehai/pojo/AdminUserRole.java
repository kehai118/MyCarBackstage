package com.kehai.pojo;

import java.io.Serializable;

/**
 * admin_user_role
 * @author 
 */
public class AdminUserRole implements Serializable {
    private Integer id;

    /**
     * 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    private Integer userId;

    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}