package com.kehai.pojo;

import java.io.Serializable;

/**
 * area
 * @author 
 */
public class Area implements Serializable {
    private Integer id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Integer pid;

    private String areacode;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }
}