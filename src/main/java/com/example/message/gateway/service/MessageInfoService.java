package com.example.message.gateway.service;

import com.example.message.gateway.entity.po.MessageInfo;
import com.github.pagehelper.PageInfo;

public interface MessageInfoService {
    PageInfo<MessageInfo> listPushInfoByPage(int pageNum, int pageSize);

    int delete(long id);
}
