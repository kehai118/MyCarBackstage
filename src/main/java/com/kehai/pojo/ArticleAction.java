package com.kehai.pojo;

import java.io.Serializable;

/**
 * article_action
 * @author 
 */
public class ArticleAction implements Serializable {
    private Long id;

    private Long articleId;

    /**
     * 0：未启用
            1：已启用
     */
    private Integer operatorUid;

    /**
     * 0：非默认摘要
            1：默认摘要
     */
    private String operatorUsername;

    private Long createTime;

    private String content;

    /**
     * 1：新增
            2：编辑
            3：审核
            4：删除
     */
    private Byte operateType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getOperatorUid() {
        return operatorUid;
    }

    public void setOperatorUid(Integer operatorUid) {
        this.operatorUid = operatorUid;
    }

    public String getOperatorUsername() {
        return operatorUsername;
    }

    public void setOperatorUsername(String operatorUsername) {
        this.operatorUsername = operatorUsername;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Byte getOperateType() {
        return operateType;
    }

    public void setOperateType(Byte operateType) {
        this.operateType = operateType;
    }
}