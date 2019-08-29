package com.runhang.sell.model;

import java.io.Serializable;
import java.util.Date;

public class VendorHeart implements Serializable {
    private Integer id;

    private Integer heartType;

    private Integer signal;

    private String appStatus;

    private String machineState;

    private String version;

    private Integer vdId;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    private String reason;

    private String vmctemperature;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeartType() {
        return heartType;
    }

    public void setHeartType(Integer heartType) {
        this.heartType = heartType;
    }

    public Integer getSignal() {
        return signal;
    }

    public void setSignal(Integer signal) {
        this.signal = signal;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus == null ? null : appStatus.trim();
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState == null ? null : machineState.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public Integer getVdId() {
        return vdId;
    }

    public void setVdId(Integer vdId) {
        this.vdId = vdId;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getVmctemperature() {
        return vmctemperature;
    }

    public void setVmctemperature(String vmctemperature) {
        this.vmctemperature = vmctemperature == null ? null : vmctemperature.trim();
    }
}