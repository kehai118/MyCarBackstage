package com.kehai.dto;

import com.kehai.pojo.SysMenu;
import com.kehai.pojo.SysRoleMenu;
import com.kehai.pojo.SysUser;

import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
import java.util.Date;

public class RoleDTO implements Serializable {

    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    private List<SysUser>  permsUser;
    private List<SysUser> disPermsUser;

    private List<SysMenu> permsMenu;
    private List<SysMenu> disPermsMenu;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public List<SysUser> getPermsUser() {
        return permsUser==null?new ArrayList<>():permsUser;
    }

    public void setPermsUser(List<SysUser> permsUser) {
        this.permsUser = permsUser;
    }

    public List<SysUser> getDisPermsUser() {
        return disPermsUser==null?new ArrayList<>():disPermsUser;
    }

    public void setDisPermsUser(List<SysUser> disPermsUser) {
        this.disPermsUser = disPermsUser;
    }

    public List<SysMenu> getPermsMenu() {
        return permsMenu==null?new ArrayList<>():permsMenu;
    }

    public void setPermsMenu(List<SysMenu> permsMenu) {
        this.permsMenu = permsMenu;
    }

    public List<SysMenu> getDisPermsMenu() {
        return disPermsMenu==null?new ArrayList<>():disPermsMenu;
    }

    public void setDisPermsMenu(List<SysMenu> disPermsMenu) {
        this.disPermsMenu = disPermsMenu;
    }

}
