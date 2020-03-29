package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_brand
 * @author 
 */
public class CarBrand implements Serializable {
    private Integer id;

    private String name;

    /**
     * 0：未启用
            1：已启用
     */
    private String otherName;

    private String englishName;

    private Integer countryId;

    private String logoUrl;

    /**
     * 此字段为冗余字段，存放逗号分割的标签ID，用于便捷的进行资讯的筛选等操作，真正的资讯和标签的关联关系存放在article_tag表中
     */
    private String logoMeaning;

    private String firstChar;

    private String spell;

    private String allSpell;

    private String nameSpell;

    private String nameAllSpell;

    private String introduction;

    private Byte saleStatus;

    private Byte isEnabled;

    /**
     * 如果是外部资源，那么该字段值为0
     */
    private Byte isRemoved;

    private Long createTime;

    private Long updateTime;

    /**
     * 0：草稿；
            1：等待内容审核；
            2：内容审核通过；
            3：内容审核退回；
     */
    private Long doTime;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    private Long syncTime;

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

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getLogoMeaning() {
        return logoMeaning;
    }

    public void setLogoMeaning(String logoMeaning) {
        this.logoMeaning = logoMeaning;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getAllSpell() {
        return allSpell;
    }

    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell;
    }

    public String getNameSpell() {
        return nameSpell;
    }

    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell;
    }

    public String getNameAllSpell() {
        return nameAllSpell;
    }

    public void setNameAllSpell(String nameAllSpell) {
        this.nameAllSpell = nameAllSpell;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Byte getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Byte isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Byte getIsRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(Byte isRemoved) {
        this.isRemoved = isRemoved;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDoTime() {
        return doTime;
    }

    public void setDoTime(Long doTime) {
        this.doTime = doTime;
    }

    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}