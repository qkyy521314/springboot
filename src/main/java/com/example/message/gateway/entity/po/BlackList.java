package com.example.message.gateway.entity.po;

import java.util.Date;

public class BlackList {
    private Integer blacklistID;

    private String receiver;

    private Short type;

    private String reason;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public BlackList(Integer blacklistID, String receiver, Short type, String reason, Date createTime, Date updateTime, String remark) {
        this.blacklistID = blacklistID;
        this.receiver = receiver;
        this.type = type;
        this.reason = reason;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public BlackList() {
        super();
    }

    public Integer getBlacklistID() {
        return blacklistID;
    }

    public void setBlacklistID(Integer blacklistID) {
        this.blacklistID = blacklistID;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}