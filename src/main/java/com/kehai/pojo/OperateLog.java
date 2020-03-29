package com.kehai.pojo;

import java.io.Serializable;

/**
 * operate_log
 * @author 
 */
public class OperateLog implements Serializable {
    private Long id;

    private Integer operateTime;

    private Integer operateUid;

    /**
     * 0：未接收
            1：已接收
     */
    private String tableName;

    private String tableDisname;

    /**
     * 0：未阅读
            1：已阅读
     */
    private Long dataId;

    private String operateDesc;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }

    public Integer getOperateUid() {
        return operateUid;
    }

    public void setOperateUid(Integer operateUid) {
        this.operateUid = operateUid;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableDisname() {
        return tableDisname;
    }

    public void setTableDisname(String tableDisname) {
        this.tableDisname = tableDisname;
    }

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public String getOperateDesc() {
        return operateDesc;
    }

    public void setOperateDesc(String operateDesc) {
        this.operateDesc = operateDesc;
    }
}