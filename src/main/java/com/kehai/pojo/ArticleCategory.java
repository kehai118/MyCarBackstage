package com.kehai.pojo;

import java.io.Serializable;

/**
 * article_category
 * @author 
 */
public class ArticleCategory implements Serializable {
    private Integer id;

    /**
     * 0：未启用
            1：已启用
     */
    private String name;

    /**
     * 0：未删除
            1：已删除
     */
    private Byte isDeleted;

    private Integer sortNum;

    private Long createTime;

    private Long lastUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Integer getSortNum() {
        return sortNum;
    }

    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}