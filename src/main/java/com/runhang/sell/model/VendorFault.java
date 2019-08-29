package com.runhang.sell.model;

import com.runhang.base.model.vendormgt.BaseVendorFault;

import java.io.Serializable;
import java.util.Date;

public class VendorFault implements Serializable {
    /**复制构造器*/
    public static VendorFault from (BaseVendorFault vendorFault){
        VendorFault record = new VendorFault();
        record.setId(vendorFault.getId());
        record.setVdId(vendorFault.getVdId());
        record.setOperator(vendorFault.getOperator());
        record.setFaultName (vendorFault.getFaultName());
        record.setFaultReason (vendorFault.getFaultReason());
        record.setTroubleShooting (vendorFault.getTroubleShooting());
        record.setFaultStatus (vendorFault.getFaultStatus());
        record.setMachineState (vendorFault.getMachineState());
        record.setFaultPhoto (vendorFault.getFaultPhoto());
        record.setFaultTime (vendorFault.getFaultTime());
        record.setLastHeartbeatTime (vendorFault.getLastHeartbeatTime());
        record.setSolveTime (vendorFault.getSolveTime());
        record.setCreateTime (vendorFault.getCreateTime());
        record.setUpdateTime (vendorFault.getUpdateTime());
        record.setDeleted (vendorFault.getDeleted());
        return record;
    }

    private Integer id;

    private Integer vdId;

    private Integer operator;

    private String faultName;

    private String faultReason;

    private String troubleShooting;

    private Integer faultStatus;

    private String machineState;

    private Integer faultPhoto;

    private Date faultTime;

    private Date lastHeartbeatTime;

    private Date solveTime;

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

    public Integer getVdId() {
        return vdId;
    }

    public void setVdId(Integer vdId) {
        this.vdId = vdId;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getFaultName() {
        return faultName;
    }

    public void setFaultName(String faultName) {
        this.faultName = faultName == null ? null : faultName.trim();
    }

    public String getFaultReason() {
        return faultReason;
    }

    public void setFaultReason(String faultReason) {
        this.faultReason = faultReason == null ? null : faultReason.trim();
    }

    public String getTroubleShooting() {
        return troubleShooting;
    }

    public void setTroubleShooting(String troubleShooting) {
        this.troubleShooting = troubleShooting == null ? null : troubleShooting.trim();
    }

    public Integer getFaultStatus() {
        return faultStatus;
    }

    public void setFaultStatus(Integer faultStatus) {
        this.faultStatus = faultStatus;
    }

    public String getMachineState() {
        return machineState;
    }

    public void setMachineState(String machineState) {
        this.machineState = machineState == null ? null : machineState.trim();
    }

    public Integer getFaultPhoto() {
        return faultPhoto;
    }

    public void setFaultPhoto(Integer faultPhoto) {
        this.faultPhoto = faultPhoto;
    }

    public Date getFaultTime() {
        return faultTime;
    }

    public void setFaultTime(Date faultTime) {
        this.faultTime = faultTime;
    }

    public Date getLastHeartbeatTime() {
        return lastHeartbeatTime;
    }

    public void setLastHeartbeatTime(Date lastHeartbeatTime) {
        this.lastHeartbeatTime = lastHeartbeatTime;
    }

    public Date getSolveTime() {
        return solveTime;
    }

    public void setSolveTime(Date solveTime) {
        this.solveTime = solveTime;
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