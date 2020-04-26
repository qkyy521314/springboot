package com.example.message.gateway.service;

import com.example.message.gateway.entity.po.Template;
import com.github.pagehelper.PageInfo;

public interface TemplateService {

    Template getTemplateByTemplateSign(String templateSign);

    PageInfo<Template> listTemplateByPage(int pageNum, int pageSize);

    int insert(Template template);

    int delete(Integer templateID);

    Template findTemplateById(Integer templateID);

    int change(Template template);

}