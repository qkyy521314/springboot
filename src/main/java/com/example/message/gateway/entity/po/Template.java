package com.example.message.gateway.entity.po;

import java.util.Date;

public class Template {
    private Integer templateID;

    private String templateName;

    private String templateSign;

    private String templateContent;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Template(Integer templateID, String templateName, String templateSign, String templateContent, Date createTime, Date updateTime, String remark) {
        this.templateID = templateID;
        this.templateName = templateName;
        this.templateSign = templateSign;
        this.templateContent = templateContent;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.remark = remark;
    }

    public Template() {
        super();
    }

    public Integer getTemplateID() {
        return templateID;
    }

    public void setTemplateID(Integer templateID) {
        this.templateID = templateID;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getTemplateSign() {
        return templateSign;
    }

    public void setTemplateSign(String templateSign) {
        this.templateSign = templateSign == null ? null : templateSign.trim();
    }

    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent == null ? null : templateContent.trim();
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