package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class TimingAdvertPlan implements Serializable {
    private Integer id;

    private String code;

    private String name;

    private Integer advertCount;

    private Integer advertTotalTime;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAdvertCount() {
        return advertCount;
    }

    public void setAdvertCount(Integer advertCount) {
        this.advertCount = advertCount;
    }

    public Integer getAdvertTotalTime() {
        return advertTotalTime;
    }

    public void setAdvertTotalTime(Integer advertTotalTime) {
        this.advertTotalTime = advertTotalTime;
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