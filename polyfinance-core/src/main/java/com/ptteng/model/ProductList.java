package com.ptteng.model;

import java.math.BigDecimal;

public class ProductList {
    private Long id;

    private String productName;

    private Long annualRate;

    private Long productTerm;

    private BigDecimal startAmount;

    private BigDecimal minAmount;

    private Integer repaymentMode;

    private Integer state;

    private Integer whetherNewgift;

    private String introduction;

    private String more;

    private Long createAt;

    private Long updateAt;

    private Long createBy;

    private Long updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Long getAnnualRate() {
        return annualRate;
    }

    public void setAnnualRate(Long annualRate) {
        this.annualRate = annualRate;
    }

    public Long getProductTerm() {
        return productTerm;
    }

    public void setProductTerm(Long productTerm) {
        this.productTerm = productTerm;
    }

    public BigDecimal getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(BigDecimal startAmount) {
        this.startAmount = startAmount;
    }

    public BigDecimal getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(BigDecimal minAmount) {
        this.minAmount = minAmount;
    }

    public Integer getRepaymentMode() {
        return repaymentMode;
    }

    public void setRepaymentMode(Integer repaymentMode) {
        this.repaymentMode = repaymentMode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getWhetherNewgift() {
        return whetherNewgift;
    }

    public void setWhetherNewgift(Integer whetherNewgift) {
        this.whetherNewgift = whetherNewgift;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more == null ? null : more.trim();
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
}