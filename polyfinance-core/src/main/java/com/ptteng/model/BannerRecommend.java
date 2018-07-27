package com.ptteng.model;

public class BannerRecommend {
    private Long id;

    private String title;

    private String pictureUrl;

    private Long createAt;

    private Long updateAt;

    private Long createBy;

    private Long updateBy;

    private Integer state;

    private String productUrl;

    private Integer whetherNewgift;

    private Integer picturcType;

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
        this.title = title == null ? null : title.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public Integer getWhetherNewgift() {
        return whetherNewgift;
    }

    public void setWhetherNewgift(Integer whetherNewgift) {
        this.whetherNewgift = whetherNewgift;
    }

    public Integer getPicturcType() {
        return picturcType;
    }

    public void setPicturcType(Integer picturcType) {
        this.picturcType = picturcType;
    }
}