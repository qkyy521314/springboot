package com.example.message.gateway.service.impl;

import com.example.message.gateway.entity.po.Template;
import com.example.message.gateway.entity.po.TemplateExample;
import com.example.message.gateway.persistence.dao.TemplateMapper;
import com.example.message.gateway.service.TemplateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class TemplateServiceImpl implements TemplateService {

    @Resource
    public TemplateMapper templateMapper;

    @Override
    public Template getTemplateByTemplateSign(String templateSign) {
        TemplateExample templateExample = new TemplateExample();
        templateExample.createCriteria().andTemplateSignEqualTo(templateSign);
        List<Template> templateList = templateMapper.selectByExample(templateExample);
        if (CollectionUtils.isEmpty(templateList)) return null;
        return templateList.get(0);
    }

    @Override
    public int change(Template template) {
        return templateMapper.updateByPrimaryKeySelective(template);
    }

    @Override
    public Template findTemplateById(Integer templateID) {
        return templateMapper.selectByPrimaryKey(templateID);
    }

    @Override
    public int delete(Integer templateID) {
        return templateMapper.deleteByPrimaryKey(templateID);
    }

    @Override
    public int insert(Template template) {
        template.setCreateTime(new Date());
        return templateMapper.insert(template);
    }

    @Override
    public PageInfo<Template> listTemplateByPage(int page, int pageSize) {
        PageHelper.startPage(page, pageSize);//分页起始码以及每页条数
        List<Template> templateList = templateMapper.selectByExample(new TemplateExample());
        return new PageInfo(templateList);
    }
}
