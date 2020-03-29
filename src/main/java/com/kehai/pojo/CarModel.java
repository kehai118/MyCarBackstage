package com.kehai.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * car_model
 * @author 
 */
public class CarModel implements Serializable {
    private Long id;

    private Integer brandId;

    private String brandName;

    private Integer makeId;

    private String makeName;

    private String name;

    private String displayName;

    /**
     * 0：未启用
            1：已启用
     */
    private String otherName;

    private String englishName;

    private Integer countryClass;

    private String countryClassName;

    /**
     * 类似：SUV、MPV等
     */
    private Integer bodyForm;

    private String bodyFormName;

    private BigDecimal priceLow;

    private BigDecimal priceHigh;

    /**
     * 0：其它
            1：微型车
            2：小型车
            3：紧凑型车
            4：中型车
            5：中大型车
            6：豪华车
            7：SUV
            8：MPV
            9：跑车
            10：概念车
            11：面包车
            12：皮卡
            13：轻客
            14：客车
            15：卡车
            16：轻卡
            17：重卡
     */
    private Integer level;

    private String levelName;

    /**
     * 0：其它
            1：小型suv
            2：紧凑型suv
            3：中型suv
            4：中大型suv
            5：大型suv
            6：微客
            7：小客
            8：中客
            9：大客
            10：微卡
            11：轻卡
            12：中卡
            13：重卡
     */
    private Integer levelSecond;

    private String levelSecondName;

    private Byte saleStatus;

    private String allSpell;

    private Integer countryId;

    private String countryName;

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

    public Integer getMakeId() {
        return makeId;
    }

    public void setMakeId(Integer makeId) {
        this.makeId = makeId;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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

    public Integer getCountryClass() {
        return countryClass;
    }

    public void setCountryClass(Integer countryClass) {
        this.countryClass = countryClass;
    }

    public String getCountryClassName() {
        return countryClassName;
    }

    public void setCountryClassName(String countryClassName) {
        this.countryClassName = countryClassName;
    }

    public Integer getBodyForm() {
        return bodyForm;
    }

    public void setBodyForm(Integer bodyForm) {
        this.bodyForm = bodyForm;
    }

    public String getBodyFormName() {
        return bodyFormName;
    }

    public void setBodyFormName(String bodyFormName) {
        this.bodyFormName = bodyFormName;
    }

    public BigDecimal getPriceLow() {
        return priceLow;
    }

    public void setPriceLow(BigDecimal priceLow) {
        this.priceLow = priceLow;
    }

    public BigDecimal getPriceHigh() {
        return priceHigh;
    }

    public void setPriceHigh(BigDecimal priceHigh) {
        this.priceHigh = priceHigh;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getLevelSecond() {
        return levelSecond;
    }

    public void setLevelSecond(Integer levelSecond) {
        this.levelSecond = levelSecond;
    }

    public String getLevelSecondName() {
        return levelSecondName;
    }

    public void setLevelSecondName(String levelSecondName) {
        this.levelSecondName = levelSecondName;
    }

    public Byte getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Byte saleStatus) {
        this.saleStatus = saleStatus;
    }

    public String getAllSpell() {
        return allSpell;
    }

    public void setAllSpell(String allSpell) {
        this.allSpell = allSpell;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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