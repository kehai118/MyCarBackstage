package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_param_type
 * @author 
 */
public class CarParamType implements Serializable {
    private Long id;

    private String typeName;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}