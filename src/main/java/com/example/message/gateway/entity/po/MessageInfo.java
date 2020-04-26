package com.example.message.gateway.entity.po;

import java.util.Date;

public class MessageInfo {
    private Long id;

    private String msgID;

    private String receiver;

    private String providerSign;

    private String appKey;

    private Short type;

    private Short sendStatus;

    private Short providerStatus;

    private Integer sendCount;

    private Double successRate;

    private String content;

    private String returnContent;

    private String callbackContent;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public MessageInfo(Long id, String msgID, String receiver, String providerSign, String appKey, Short type, Short sendStatus, Short providerStatus, Integer sendCount, Double successRate, String content, String returnContent, String callbackContent, Date createTime, Date updateTime, String remark) {
        this.id = id;
        this.msgID = msgID;
        this.receiver = receiver;
        this.providerSign = providerSign;
        this.appKey = appKey;
        this.type = type;
        this.sendStatus = sendStatus;
        this.providerStatus = providerStatus;
        this.sendCount = sendCount;
        this.successRate = successRate;
        this.content = content;
        this.returnContent = returnContent;
        this.callbackContent = callbackContent;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public MessageInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsgID() {
        return msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID == null ? null : msgID.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getProviderSign() {
        return providerSign;
    }

    public void setProviderSign(String providerSign) {
        this.providerSign = providerSign == null ? null : providerSign.trim();
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Short sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Short getProviderStatus() {
        return providerStatus;
    }

    public void setProviderStatus(Short providerStatus) {
        this.providerStatus = providerStatus;
    }

    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public Double getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(Double successRate) {
        this.successRate = successRate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent == null ? null : returnContent.trim();
    }

    public String getCallbackContent() {
        return callbackContent;
    }

    public void setCallbackContent(String callbackContent) {
        this.callbackContent = callbackContent == null ? null : callbackContent.trim();
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