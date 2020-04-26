package com.example.message.gateway.service.impl;

import com.example.message.gateway.entity.po.Application;
import com.example.message.gateway.entity.po.ApplicationExample;
import com.example.message.gateway.persistence.dao.ApplicationMapper;
import com.example.message.gateway.service.ApplicationService;
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
public class ApplicationServiceImpl implements ApplicationService {

    @Resource
    ApplicationMapper applicationMapper;

    @Override
    public Application getApplicationByAppKey(String appKey) {
        ApplicationExample applicationExample = new ApplicationExample();
        applicationExample.createCriteria().andAppKeyEqualTo(appKey).andAppStatusGreaterThan((short) 0);
        List<Application> applications = applicationMapper.selectByExample(applicationExample);
        if (CollectionUtils.isEmpty(applications)) return null;
        else return applications.get(0);
    }

    @Override
    public PageInfo<Application> listApplicationByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ApplicationExample applicationExample = new ApplicationExample();
        List<Application> applicationList = applicationMapper.selectByExample(applicationExample);
        return new PageInfo<>(applicationList);
    }

    @Override
    public int insert(Application application) {
        application.setAppStatus((short) 1);
        application.setCreateTime(new Date());
        if (application.getSendTimeStatus() == 0) {
            application.setSendEtime(null);
            application.setSendStime(null);
        }
        if (application.getSendType() == 0) application.setTemplateSign(null);
        return applicationMapper.insertSelective(application);
    }

    @Override
    public int delete(Integer appID) {
        return applicationMapper.deleteByPrimaryKey(appID);
    }

    @Override
    public Application findApplicationById(Integer appID) {
        return applicationMapper.selectByPrimaryKey(appID);
    }

    @Override
    public int change(Application app) {
        app.setUpdateTime(new Date());
        if (app.getSendType() == 0) app.setTemplateSign("");
        return applicationMapper.updateByPrimaryKeySelective(app);
    }
}