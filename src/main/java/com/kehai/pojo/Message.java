package com.kehai.pojo;

import java.io.Serializable;

/**
 * message
 * @author 
 */
public class Message implements Serializable {
    private Long id;

    private Byte type;

    private String link;

    /**
     * 0：立即发送
            1：定时发送
     */
    private Integer isSchedule;

    private Long scheduleTime;

    private Long sendTime;

    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getIsSchedule() {
        return isSchedule;
    }

    public void setIsSchedule(Integer isSchedule) {
        this.isSchedule = isSchedule;
    }

    public Long getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(Long scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}