package com.example.message.gateway.persistence.dao;

import com.example.message.gateway.entity.po.MessageInfo;
import com.example.message.gateway.entity.po.MessageInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageInfoMapper {
    long countByExample(MessageInfoExample example);

    int deleteByExample(MessageInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageInfo record);

    int insertSelective(MessageInfo record);

    List<MessageInfo> selectByExample(MessageInfoExample example);

    MessageInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    int updateByExample(@Param("record") MessageInfo record, @Param("example") MessageInfoExample example);

    int updateByPrimaryKeySelective(MessageInfo record);

    int updateByPrimaryKey(MessageInfo record);
}