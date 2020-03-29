package com.kehai.pojo;

import java.io.Serializable;

/**
 * car_make
 * @author 
 */
public class CarMake implements Serializable {
    private Long id;

    private Integer brandId;

    private String brandName;

    private String name;

    /**
     * 0：未启用
            1：已启用
     */
    private String otherName;

    private String englishName;

    private Integer manufacturerId;

    private Integer countryId;

    private String phone;

    private String website;

    private String logoUrl;

    private String spell;

    private String introduction;

    private Byte isEnabled;

    /**
     * 如果是外部资源，那么该字段值为0
     */
    private Byte isRemoved;

    private Long createTime;

    private Long updateTime;

    /**
     * 仅当发布审核通过时才记录该时间
     */
    private Long syncTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
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

    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }
}