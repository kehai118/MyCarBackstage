package com.kehai.pojo;

import java.io.Serializable;

/**
 * sdk_interface_info
 * @author 
 */
public class SdkInterfaceInfo implements Serializable {
    private Integer id;

    private Integer activityId;

    private String carsId;

    private String activityKey;

    private String dealer;

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

    public String getCarsId() {
        return carsId;
    }

    public void setCarsId(String carsId) {
        this.carsId = carsId;
    }

    public String getActivityKey() {
        return activityKey;
    }

    public void setActivityKey(String activityKey) {
        this.activityKey = activityKey;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }
}