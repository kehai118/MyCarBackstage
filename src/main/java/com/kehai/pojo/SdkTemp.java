package com.kehai.pojo;

import java.io.Serializable;

/**
 * sdk_temp
 * @author 
 */
public class SdkTemp implements Serializable {
    private Integer id;

    private Integer activityId;

    private String sdkPath;

    private Long createTime;

    private String sdkName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getSdkPath() {
        return sdkPath;
    }

    public void setSdkPath(String sdkPath) {
        this.sdkPath = sdkPath;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getSdkName() {
        return sdkName;
    }

    public void setSdkName(String sdkName) {
        this.sdkName = sdkName;
    }
}