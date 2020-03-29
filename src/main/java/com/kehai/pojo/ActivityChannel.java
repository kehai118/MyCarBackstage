package com.kehai.pojo;

import java.io.Serializable;

/**
 * activity_channel
 * @author 
 */
public class ActivityChannel implements Serializable {
    private Long id;

    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Byte isDeleted;

    private Long createTime;

    private Long lastUpdateTime;

    private String useCount;

    private String sign;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getUseCount() {
        return useCount;
    }

    public void setUseCount(String useCount) {
        this.useCount = useCount;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}