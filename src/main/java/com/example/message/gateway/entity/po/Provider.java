package com.example.message.gateway.entity.po;

import java.util.Date;

public class Provider {
    private Integer providerID;

    private String providerSign;

    private String providerName;

    private String impl;

    private Date createTime;

    private Date updateTime;

    private Double alarmValue;

    private String username;

    private String password;

    private String url;

    private String remark;

    public Provider(Integer providerID, String providerSign, String providerName, String impl, Date createTime, Date updateTime, Double alarmValue, String username, String password, String url, String remark) {
        this.providerID = providerID;
        this.providerSign = providerSign;
        this.providerName = providerName;
        this.impl = impl;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.alarmValue = alarmValue;
        this.username = username;
        this.password = password;
        this.url = url;
        this.remark = remark;
    }

    public Provider() {
        super();
    }

    public Integer getProviderID() {
        return providerID;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
    }

    public String getProviderSign() {
        return providerSign;
    }

    public void setProviderSign(String providerSign) {
        this.providerSign = providerSign == null ? null : providerSign.trim();
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName == null ? null : providerName.trim();
    }

    public String getImpl() {
        return impl;
    }

    public void setImpl(String impl) {
        this.impl = impl == null ? null : impl.trim();
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

    public Double getAlarmValue() {
        return alarmValue;
    }

    public void setAlarmValue(Double alarmValue) {
        this.alarmValue = alarmValue;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}