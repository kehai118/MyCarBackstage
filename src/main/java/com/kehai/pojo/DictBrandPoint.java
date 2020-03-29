package com.kehai.pojo;

import java.io.Serializable;

/**
 * dict_brand_point
 * @author 
 */
public class DictBrandPoint implements Serializable {
    private Integer id;

    /**
     * 关联car_brand表的ID字段
     */
    private Integer brandId;

    private String name;

    private Byte point;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getPoint() {
        return point;
    }

    public void setPoint(Byte point) {
        this.point = point;
    }
}