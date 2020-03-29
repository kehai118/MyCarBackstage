package com.kehai.pojo;

import java.io.Serializable;

/**
 * product
 * @author 
 */
public class ProductWithBLOBs extends Product implements Serializable {
    private String description;

    private String service;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}