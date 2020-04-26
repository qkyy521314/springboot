package com.example.message.gateway.entity.po;

import java.util.Date;

public class Application {
    private Integer appID;

    private String appKey;

    private String appName;

    private Short appStatus;

    private Short sendType;

    private String templateSign;

    private String providerSign;

    private Short sendTimeStatus;

    private String sendStime;

    private String sendEtime;

    private Date createTime;

    private Date updateTime;

    private Short blacklistStatus;

    private String remark;

    public Application(Integer appID, String appKey, String appName, Short appStatus, Short sendType, String templateSign, String providerSign, Short sendTimeStatus, String sendStime, String sendEtime, Date createTime, Date updateTime, Short blacklistStatus, String remark) {
        this.appID = appID;
        this.appKey = appKey;
        this.appName = appName;
        this.appStatus = appStatus;
        this.sendType = sendType;
        this.templateSign = templateSign;
        this.providerSign = providerSign;
        this.sendTimeStatus = sendTimeStatus;
        this.sendStime = sendStime;
        this.sendEtime = sendEtime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.blacklistStatus = blacklistStatus;
        this.remark = remark;
    }

    public Application() {
        super();
    }

    public Integer getAppID() {
        return appID;
    }

    public void setAppID(Integer appID) {
        this.appID = appID;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    public Short getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Short appStatus) {
        this.appStatus = appStatus;
    }

    public Short getSendType() {
        return sendType;
    }

    public void setSendType(Short sendType) {
        this.sendType = sendType;
    }

    public String getTemplateSign() {
        return templateSign;
    }

    public void setTemplateSign(String templateSign) {
        this.templateSign = templateSign == null ? null : templateSign.trim();
    }

    public String getProviderSign() {
        return providerSign;
    }

    public void setProviderSign(String providerSign) {
        this.providerSign = providerSign == null ? null : providerSign.trim();
    }

    public Short getSendTimeStatus() {
        return sendTimeStatus;
    }

    public void setSendTimeStatus(Short sendTimeStatus) {
        this.sendTimeStatus = sendTimeStatus;
    }

    public String getSendStime() {
        return sendStime;
    }

    public void setSendStime(String sendStime) {
        this.sendStime = sendStime == null ? null : sendStime.trim();
    }

    public String getSendEtime() {
        return sendEtime;
    }

    public void setSendEtime(String sendEtime) {
        this.sendEtime = sendEtime == null ? null : sendEtime.trim();
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

    public Short getBlacklistStatus() {
        return blacklistStatus;
    }

    public void setBlacklistStatus(Short blacklistStatus) {
        this.blacklistStatus = blacklistStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}