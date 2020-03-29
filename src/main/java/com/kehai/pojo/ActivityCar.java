package com.kehai.pojo;

import java.io.Serializable;

/**
 * activity_car
 * @author 
 */
public class ActivityCar implements Serializable {
    private Long id;

    private Long activityId;

    /**
     * 对应car_model表的id字段
     */
    private Long carId;

    private Integer enable;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }
}