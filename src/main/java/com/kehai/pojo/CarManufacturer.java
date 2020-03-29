package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_manufacturer
 * @author 
 */
public class CarManufacturer implements Serializable {
    private Long id;

    private String manufacturerName;

    private Integer makeId;

    private Long createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long  id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}