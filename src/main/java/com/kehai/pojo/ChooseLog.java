package com.kehai.pojo;

import java.io.Serializable;

/**
 * choose_log
 * @author 
 */
public class ChooseLog implements Serializable {
    private Integer id;

    private String memberId;

    private Byte userCountry;

    private String userSpace;

    private String userPower;

    /**
     * 关联car_model表的ID字段
     */
    private String userComfort;

    private String userSafe;

    private String userCost;

    private String userMin;

    private String userMax;

    private String userPtime;

    private String userCar;

    private String chooseCar;

    private Long createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Byte getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(Byte userCountry) {
        this.userCountry = userCountry;
    }

    public String getUserSpace() {
        return userSpace;
    }

    public void setUserSpace(String userSpace) {
        this.userSpace = userSpace;
    }

    public String getUserPower() {
        return userPower;
    }

    public void setUserPower(String userPower) {
        this.userPower = userPower;
    }

    public String getUserComfort() {
        return userComfort;
    }

    public void setUserComfort(String userComfort) {
        this.userComfort = userComfort;
    }

    public String getUserSafe() {
        return userSafe;
    }

    public void setUserSafe(String userSafe) {
        this.userSafe = userSafe;
    }

    public String getUserCost() {
        return userCost;
    }

    public void setUserCost(String userCost) {
        this.userCost = userCost;
    }

    public String getUserMin() {
        return userMin;
    }

    public void setUserMin(String userMin) {
        this.userMin = userMin;
    }

    public String getUserMax() {
        return userMax;
    }

    public void setUserMax(String userMax) {
        this.userMax = userMax;
    }

    public String getUserPtime() {
        return userPtime;
    }

    public void setUserPtime(String userPtime) {
        this.userPtime = userPtime;
    }

    public String getUserCar() {
        return userCar;
    }

    public void setUserCar(String userCar) {
        this.userCar = userCar;
    }

    public String getChooseCar() {
        return chooseCar;
    }

    public void setChooseCar(String chooseCar) {
        this.chooseCar = chooseCar;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}