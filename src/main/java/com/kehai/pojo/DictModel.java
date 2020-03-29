package com.kehai.pojo;

import java.io.Serializable;

/**
 * dict_model
 * @author 
 */
public class DictModel implements Serializable {
    private Integer id;

    private String code;

    private String country;

    private String modelName;

    /**
     * 关联car_model表的ID字段
     */
    private Integer modelId;

    private Integer msrpMin;

    private Byte space;

    private Byte power;

    private Byte comfort;

    private Byte cost;

    private Byte safety;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getMsrpMin() {
        return msrpMin;
    }

    public void setMsrpMin(Integer msrpMin) {
        this.msrpMin = msrpMin;
    }

    public Byte getSpace() {
        return space;
    }

    public void setSpace(Byte space) {
        this.space = space;
    }

    public Byte getPower() {
        return power;
    }

    public void setPower(Byte power) {
        this.power = power;
    }

    public Byte getComfort() {
        return comfort;
    }

    public void setComfort(Byte comfort) {
        this.comfort = comfort;
    }

    public Byte getCost() {
        return cost;
    }

    public void setCost(Byte cost) {
        this.cost = cost;
    }

    public Byte getSafety() {
        return safety;
    }

    public void setSafety(Byte safety) {
        this.safety = safety;
    }
}