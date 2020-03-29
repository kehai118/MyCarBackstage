package com.kehai.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * car_select_list
 * @author 
 */
public class CarSelectList implements Serializable {
    private Integer id;

    private String type;

    private String country;

    private String carType;

    private Boolean carTypeBak;

    /**
     * 关联car_model表的ID字段
     */
    private BigDecimal msrpMin;

    private BigDecimal msrpMax;

    /**
     * 所属车系 ：自主1 日2 韩3 德4 美5 欧6
     */
    private Boolean countryType;

    private Boolean countryStd;

    private BigDecimal spaceStd;

    private BigDecimal powerStd;

    private BigDecimal comfortStd;

    private BigDecimal costStd;

    private BigDecimal safeStd;

    private Integer carId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Boolean getCarTypeBak() {
        return carTypeBak;
    }

    public void setCarTypeBak(Boolean carTypeBak) {
        this.carTypeBak = carTypeBak;
    }

    public BigDecimal getMsrpMin() {
        return msrpMin;
    }

    public void setMsrpMin(BigDecimal msrpMin) {
        this.msrpMin = msrpMin;
    }

    public BigDecimal getMsrpMax() {
        return msrpMax;
    }

    public void setMsrpMax(BigDecimal msrpMax) {
        this.msrpMax = msrpMax;
    }

    public Boolean getCountryType() {
        return countryType;
    }

    public void setCountryType(Boolean countryType) {
        this.countryType = countryType;
    }

    public Boolean getCountryStd() {
        return countryStd;
    }

    public void setCountryStd(Boolean countryStd) {
        this.countryStd = countryStd;
    }

    public BigDecimal getSpaceStd() {
        return spaceStd;
    }

    public void setSpaceStd(BigDecimal spaceStd) {
        this.spaceStd = spaceStd;
    }

    public BigDecimal getPowerStd() {
        return powerStd;
    }

    public void setPowerStd(BigDecimal powerStd) {
        this.powerStd = powerStd;
    }

    public BigDecimal getComfortStd() {
        return comfortStd;
    }

    public void setComfortStd(BigDecimal comfortStd) {
        this.comfortStd = comfortStd;
    }

    public BigDecimal getCostStd() {
        return costStd;
    }

    public void setCostStd(BigDecimal costStd) {
        this.costStd = costStd;
    }

    public BigDecimal getSafeStd() {
        return safeStd;
    }

    public void setSafeStd(BigDecimal safeStd) {
        this.safeStd = safeStd;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }
}