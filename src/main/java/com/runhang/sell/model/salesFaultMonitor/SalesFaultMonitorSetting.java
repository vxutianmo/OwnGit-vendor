package com.runhang.sell.model.salesFaultMonitor;

import java.io.Serializable;
import java.util.Date;

public class SalesFaultMonitorSetting implements Serializable {

    public static final String TYPE_All = "ALL";

    public static final Integer MONITOR_STATUS_Y = 0;

    private Integer id;

    private Integer busId;

    private String monitorType;

    private Integer monitorStatus;

    private Integer monitorCounts;

    private Integer monitorTime;

    private String remark;

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

    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType == null ? null : monitorType.trim();
    }

    public Integer getMonitorStatus() {
        return monitorStatus;
    }

    public void setMonitorStatus(Integer monitorStatus) {
        this.monitorStatus = monitorStatus;
    }

    public Integer getMonitorCounts() {
        return monitorCounts;
    }

    public void setMonitorCounts(Integer monitorCounts) {
        this.monitorCounts = monitorCounts;
    }

    public Integer getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Integer monitorTime) {
        this.monitorTime = monitorTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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