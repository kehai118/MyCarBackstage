package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_model_image
 * @author 
 */
public class CarModelImage implements Serializable {
    private Integer id;

    private Integer modelId;

    private String year;

    private Integer modDefault;

    private String imgUrl;

    private Long createTime;

    private Long updateTime;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    private Long syncTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Integer getModDefault() {
        return modDefault;
    }

    public void setModDefault(Integer modDefault) {
        this.modDefault = modDefault;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}