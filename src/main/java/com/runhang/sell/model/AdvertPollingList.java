package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class AdvertPollingList implements Serializable {
    private Integer id;

    private Integer apapId;

    private Integer adId;

    private Integer advertOrder;

    private Integer playCount;

    private Integer playCountToday;

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

    public Integer getApapId() {
        return apapId;
    }

    public void setApapId(Integer apapId) {
        this.apapId = apapId;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdvertOrder() {
        return advertOrder;
    }

    public void setAdvertOrder(Integer advertOrder) {
        this.advertOrder = advertOrder;
    }

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    public Integer getPlayCountToday() {
        return playCountToday;
    }

    public void setPlayCountToday(Integer playCountToday) {
        this.playCountToday = playCountToday;
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