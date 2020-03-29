package com.kehai.pojo;

import java.io.Serializable;

/**
 * sys_config
 * @author 
 */
public class SysConfig implements Serializable {
    private Long id;

    /**
     * key
     */
    private String key;

    /**
     * value
     */
    private String value;

    /**
     * 状态   0：隐藏   1：显示
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}