package com.kehai.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * article
 * @author 
 */
public class Article implements Serializable {
    private Long id;

    private String title;

    /**
     * 0：未启用
            1：已启用
     */
    private Integer categoryId;

    private String source;

    private String author;

    private String summary;

    private String coverPic;

    private String thumbPic;

    /**
     * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    private String tags;

    private String previewUrl;

    private String qrcodeUrl;

    private Integer pvCount;

    private Integer uvCount;

    private Integer commentCount;

    private Integer likeCount;

    private Integer favCount;

    private Integer shareCount;

    private Byte channelTop;

    private Byte homeTop;

    /**
     * 如果是外部资源，那么该字段值为0
     */
    private Integer createUid;

    private String createUname;

    private Long createTime;

    private Integer submitUid;

    private Long submitTime;

    /**
     * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    private Integer state;

    /**
     * 该字段用于内容列表按照审核状态降序排列：
            0：草稿；
            1：内容审核通过；
            2：等待内容审核；
            3：内容审核退回；
     */
    private Integer stateOrder;

    private Integer lastAuditUid;

    private String lastAuditUsername;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    private Long lastAuditTime;

    private String lastRejectReason;

    /**
     * 0：未发布
            1：已发布
     */
    private Byte publishState;

    private Integer publishUid;

    private String publishUname;

    private Long publishTime;

    private Integer unpublishUid;

    private String unpublishUname;

    private Long unpublishTime;

    private String unpublishReason;

    private Integer lastUpdateUid;

    private String lastUpdateUname;

    private Long lastUpdateTime;

    private String seoKeywords;

    private String seoDescription;

    /**
     * 0：不允许
            1：允许
     */
    private Byte allowUp;

    /**
     * 0：不允许
            1：允许
     */
    private Byte allowFav;

    private String content;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getThumbPic() {
        return thumbPic;
    }

    public void setThumbPic(String thumbPic) {
        this.thumbPic = thumbPic;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public Integer getPvCount() {
        return pvCount;
    }

    public void setPvCount(Integer pvCount) {
        this.pvCount = pvCount;
    }

    public Integer getUvCount() {
        return uvCount;
    }

    public void setUvCount(Integer uvCount) {
        this.uvCount = uvCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getFavCount() {
        return favCount;
    }

    public void setFavCount(Integer favCount) {
        this.favCount = favCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Byte getChannelTop() {
        return channelTop;
    }

    public void setChannelTop(Byte channelTop) {
        this.channelTop = channelTop;
    }

    public Byte getHomeTop() {
        return homeTop;
    }

    public void setHomeTop(Byte homeTop) {
        this.homeTop = homeTop;
    }

    public Integer getCreateUid() {
        return createUid;
    }

    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    public String getCreateUname() {
        return createUname;
    }

    public void setCreateUname(String createUname) {
        this.createUname = createUname;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getSubmitUid() {
        return submitUid;
    }

    public void setSubmitUid(Integer submitUid) {
        this.submitUid = submitUid;
    }

    public Long getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Long submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStateOrder() {
        return stateOrder;
    }

    public void setStateOrder(Integer stateOrder) {
        this.stateOrder = stateOrder;
    }

    public Integer getLastAuditUid() {
        return lastAuditUid;
    }

    public void setLastAuditUid(Integer lastAuditUid) {
        this.lastAuditUid = lastAuditUid;
    }

    public String getLastAuditUsername() {
        return lastAuditUsername;
    }

    public void setLastAuditUsername(String lastAuditUsername) {
        this.lastAuditUsername = lastAuditUsername;
    }

    public Long getLastAuditTime() {
        return lastAuditTime;
    }

    public void setLastAuditTime(Long lastAuditTime) {
        this.lastAuditTime = lastAuditTime;
    }

    public String getLastRejectReason() {
        return lastRejectReason;
    }

    public void setLastRejectReason(String lastRejectReason) {
        this.lastRejectReason = lastRejectReason;
    }

    public Byte getPublishState() {
        return publishState;
    }

    public void setPublishState(Byte publishState) {
        this.publishState = publishState;
    }

    public Integer getPublishUid() {
        return publishUid;
    }

    public void setPublishUid(Integer publishUid) {
        this.publishUid = publishUid;
    }

    public String getPublishUname() {
        return publishUname;
    }

    public void setPublishUname(String publishUname) {
        this.publishUname = publishUname;
    }

    public Long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getUnpublishUid() {
        return unpublishUid;
    }

    public void setUnpublishUid(Integer unpublishUid) {
        this.unpublishUid = unpublishUid;
    }

    public String getUnpublishUname() {
        return unpublishUname;
    }

    public void setUnpublishUname(String unpublishUname) {
        this.unpublishUname = unpublishUname;
    }

    public Long getUnpublishTime() {
        return unpublishTime;
    }

    public void setUnpublishTime(Long unpublishTime) {
        this.unpublishTime = unpublishTime;
    }

    public String getUnpublishReason() {
        return unpublishReason;
    }

    public void setUnpublishReason(String unpublishReason) {
        this.unpublishReason = unpublishReason;
    }

    public Integer getLastUpdateUid() {
        return lastUpdateUid;
    }

    public void setLastUpdateUid(Integer lastUpdateUid) {
        this.lastUpdateUid = lastUpdateUid;
    }

    public String getLastUpdateUname() {
        return lastUpdateUname;
    }

    public void setLastUpdateUname(String lastUpdateUname) {
        this.lastUpdateUname = lastUpdateUname;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getSeoKeywords() {
        return seoKeywords;
    }

    public void setSeoKeywords(String seoKeywords) {
        this.seoKeywords = seoKeywords;
    }

    public String getSeoDescription() {
        return seoDescription;
    }

    public void setSeoDescription(String seoDescription) {
        this.seoDescription = seoDescription;
    }

    public Byte getAllowUp() {
        return allowUp;
    }

    public void setAllowUp(Byte allowUp) {
        this.allowUp = allowUp;
    }

    public Byte getAllowFav() {
        return allowFav;
    }

    public void setAllowFav(Byte allowFav) {
        this.allowFav = allowFav;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}