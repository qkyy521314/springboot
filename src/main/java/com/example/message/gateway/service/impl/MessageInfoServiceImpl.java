package com.example.message.gateway.service.impl;

import com.example.message.gateway.entity.po.MessageInfo;
import com.example.message.gateway.entity.po.MessageInfoExample;
import com.example.message.gateway.persistence.dao.MessageInfoMapper;
import com.example.message.gateway.service.MessageInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class MessageInfoServiceImpl implements MessageInfoService {

    @Resource
    MessageInfoMapper messageInfoMapper;

    @Override
    public PageInfo<MessageInfo> listPushInfoByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        MessageInfoExample messageInfoExample = new MessageInfoExample();
        List<MessageInfo> messageInfoList = messageInfoMapper.selectByExample(messageInfoExample);
        return new PageInfo<>(messageInfoList);
    }

    @Override
    public int delete(long id) {
        return messageInfoMapper.deleteByPrimaryKey(id);
    }
}
