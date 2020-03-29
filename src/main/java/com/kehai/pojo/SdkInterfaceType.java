package com.kehai.pojo;

import java.io.Serializable;

/**
 * sdk_interface_type
 * @author 
 */
public class SdkInterfaceType implements Serializable {
    private Integer id;

    private String typeId;

    private Integer interfaceCount;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public Integer getInterfaceCount() {
        return interfaceCount;
    }

    public void setInterfaceCount(Integer interfaceCount) {
        this.interfaceCount = interfaceCount;
    }
}