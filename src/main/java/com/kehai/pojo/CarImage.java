package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_image
 * @author 
 */
public class CarImage implements Serializable {
    private Integer id;

    private Integer carId;

    private String imgTitle;

    private Integer imgType;

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

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getImgTitle() {
        return imgTitle;
    }

    public void setImgTitle(String imgTitle) {
        this.imgTitle = imgTitle;
    }

    public Integer getImgType() {
        return imgType;
    }

    public void setImgType(Integer imgType) {
        this.imgType = imgType;
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