package com.kehai.pojo;

import java.io.Serializable;

/**
 * visit_log
 * @author 
 */
public class VisitLog implements Serializable {
    private Long id;

    private Long visitorId;

    private Long memberId;

    private String visitUrl;

    /**
     * 0：不是首次登录
            1：是首次登录
     */
    private String visitIp;

    private String visitDevice;

    private String visitSource;

    private Long enterTime;

    private Long exitTime;

    private Long stay;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Long visitorId) {
        this.visitorId = visitorId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getVisitUrl() {
        return visitUrl;
    }

    public void setVisitUrl(String visitUrl) {
        this.visitUrl = visitUrl;
    }

    public String getVisitIp() {
        return visitIp;
    }

    public void setVisitIp(String visitIp) {
        this.visitIp = visitIp;
    }

    public String getVisitDevice() {
        return visitDevice;
    }

    public void setVisitDevice(String visitDevice) {
        this.visitDevice = visitDevice;
    }

    public String getVisitSource() {
        return visitSource;
    }

    public void setVisitSource(String visitSource) {
        this.visitSource = visitSource;
    }

    public Long getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Long enterTime) {
        this.enterTime = enterTime;
    }

    public Long getExitTime() {
        return exitTime;
    }

    public void setExitTime(Long exitTime) {
        this.exitTime = exitTime;
    }

    public Long getStay() {
        return stay;
    }

    public void setStay(Long stay) {
        this.stay = stay;
    }
}