package com.kehai.pojo;

import java.io.Serializable;

/**
 * visitor
 * @author 
 */
public class Visitor implements Serializable {
    private Long id;

    private String visitorGuid;

    private Long firstVisitTime;

    /**
     * 0：不是首次登录
            1：是首次登录
     */
    private String entryUrl;

    private String visitorIp;

    private String visitorDevice;

    private String visitorChannel;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVisitorGuid() {
        return visitorGuid;
    }

    public void setVisitorGuid(String visitorGuid) {
        this.visitorGuid = visitorGuid;
    }

    public Long getFirstVisitTime() {
        return firstVisitTime;
    }

    public void setFirstVisitTime(Long firstVisitTime) {
        this.firstVisitTime = firstVisitTime;
    }

    public String getEntryUrl() {
        return entryUrl;
    }

    public void setEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
    }

    public String getVisitorIp() {
        return visitorIp;
    }

    public void setVisitorIp(String visitorIp) {
        this.visitorIp = visitorIp;
    }

    public String getVisitorDevice() {
        return visitorDevice;
    }

    public void setVisitorDevice(String visitorDevice) {
        this.visitorDevice = visitorDevice;
    }

    public String getVisitorChannel() {
        return visitorChannel;
    }

    public void setVisitorChannel(String visitorChannel) {
        this.visitorChannel = visitorChannel;
    }
}