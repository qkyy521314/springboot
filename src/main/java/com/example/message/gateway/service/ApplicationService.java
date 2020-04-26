package com.example.message.gateway.service;

import com.example.message.gateway.entity.po.Application;
import com.github.pagehelper.PageInfo;

public interface ApplicationService {

    Application getApplicationByAppKey(String appKey);

    PageInfo<Application> listApplicationByPage(int pageNum, int pageSize);

    int insert(Application application);

    int delete(Integer appID);

    Application findApplicationById(Integer appID);

    int change(Application app);
}
