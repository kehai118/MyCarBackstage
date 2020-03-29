package com.kehai.pojo;

import java.io.Serializable;

/**
 * admin_role
 * @author 
 */
public class AdminRole implements Serializable {
    private Integer id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Byte deleted;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}