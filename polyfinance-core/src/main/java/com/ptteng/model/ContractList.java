package com.ptteng.model;

import java.math.BigDecimal;

public class ContractList {
    private Long id;

    private Long userId;

    private Long productorId;

    private Long creditorId;

    private BigDecimal investment;

    private BigDecimal expectedEarning;

    private Long effectTime;

    private Long expireTime;

    private Long state;

    private Integer continuedState;

    private Integer sruplusAmount;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductorId() {
        return productorId;
    }

    public void setProductorId(Long productorId) {
        this.productorId = productorId;
    }

    public Long getCreditorId() {
        return creditorId;
    }

    public void setCreditorId(Long creditorId) {
        this.creditorId = creditorId;
    }

    public BigDecimal getInvestment() {
        return investment;
    }

    public void setInvestment(BigDecimal investment) {
        this.investment = investment;
    }

    public BigDecimal getExpectedEarning() {
        return expectedEarning;
    }

    public void setExpectedEarning(BigDecimal expectedEarning) {
        this.expectedEarning = expectedEarning;
    }

    public Long getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(Long effectTime) {
        this.effectTime = effectTime;
    }

    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Integer getContinuedState() {
        return continuedState;
    }

    public void setContinuedState(Integer continuedState) {
        this.continuedState = continuedState;
    }

    public Integer getSruplusAmount() {
        return sruplusAmount;
    }

    public void setSruplusAmount(Integer sruplusAmount) {
        this.sruplusAmount = sruplusAmount;
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