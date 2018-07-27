package com.ptteng.model;

import java.math.BigDecimal;

public class CreditorMatching {
    private Long id;

    private Long loanPeriod;

    private Long contractId;

    private Long productTerm;

    private BigDecimal waitMatchAmount;

    private Long interestAt;

    private Long endAt;

    private Integer state;

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

    public Long getLoanPeriod() {
        return loanPeriod;
    }

    public void setLoanPeriod(Long loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getProductTerm() {
        return productTerm;
    }

    public void setProductTerm(Long productTerm) {
        this.productTerm = productTerm;
    }

    public BigDecimal getWaitMatchAmount() {
        return waitMatchAmount;
    }

    public void setWaitMatchAmount(BigDecimal waitMatchAmount) {
        this.waitMatchAmount = waitMatchAmount;
    }

    public Long getInterestAt() {
        return interestAt;
    }

    public void setInterestAt(Long interestAt) {
        this.interestAt = interestAt;
    }

    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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