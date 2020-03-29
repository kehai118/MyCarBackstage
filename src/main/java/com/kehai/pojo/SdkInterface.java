package com.kehai.pojo;

import java.io.Serializable;

/**
 * sdk_interface
 * @author 
 */
public class SdkInterface implements Serializable {
    private Integer id;

    private Integer typeId;

    private String name;

    private String interDesc;

    private String url;

    private String success;

    private String error;

    private String requestType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInterDesc() {
        return interDesc;
    }

    public void setInterDesc(String interDesc) {
        this.interDesc = interDesc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }
}