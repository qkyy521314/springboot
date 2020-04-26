package com.example.message.gateway.persistence.dao;

import com.example.message.gateway.entity.po.Template;
import com.example.message.gateway.entity.po.TemplateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TemplateMapper {
    long countByExample(TemplateExample example);

    int deleteByExample(TemplateExample example);

    int deleteByPrimaryKey(Integer templateID);

    int insert(Template record);

    int insertSelective(Template record);

    List<Template> selectByExample(TemplateExample example);

    Template selectByPrimaryKey(Integer templateID);

    int updateByExampleSelective(@Param("record") Template record, @Param("example") TemplateExample example);

    int updateByExample(@Param("record") Template record, @Param("example") TemplateExample example);

    int updateByPrimaryKeySelective(Template record);

    int updateByPrimaryKey(Template record);
}