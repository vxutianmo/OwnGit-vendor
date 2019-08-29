package com.runhang.sell.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CopType implements Serializable {
    private Integer id;

    private String name;

    private Long rental;

    private BigDecimal proportion;

    private Long useFee;

    private String leaseWay;

    private String description;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

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
        this.name = name == null ? null : name.trim();
    }

    public Long getRental() {
        return rental;
    }

    public void setRental(Long rental) {
        this.rental = rental;
    }

    public BigDecimal getProportion() {
        return proportion;
    }

    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }

    public Long getUseFee() {
        return useFee;
    }

    public void setUseFee(Long useFee) {
        this.useFee = useFee;
    }

    public String getLeaseWay() {
        return leaseWay;
    }

    public void setLeaseWay(String leaseWay) {
        this.leaseWay = leaseWay == null ? null : leaseWay.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}