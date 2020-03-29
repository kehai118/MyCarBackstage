package com.kehai.pojo;

import java.io.Serializable;

/**
 * admin_menu_auth
 * @author 
 */
public class AdminMenuAuth implements Serializable {
    private Short id;

    /**
     * 如果该菜单为一级菜单，那么parent_guid为NULL
     */
    private String controller;

    private String action;

    private String name;

    private String classname;

    /**
     * 0：禁用
            1：启用
     */
    private Byte status;

    private Integer sort;

    /**
     * 1：模块
            2：菜单
            3：权限
     */
    private Byte type;

    private Short parentId;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Short getParentId() {
        return parentId;
    }

    public void setParentId(Short parentId) {
        this.parentId = parentId;
    }
}