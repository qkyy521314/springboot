package com.example.message.gateway.service.impl;

import com.example.message.gateway.entity.po.Provider;
import com.example.message.gateway.entity.po.ProviderExample;
import com.example.message.gateway.persistence.dao.ProviderMapper;
import com.example.message.gateway.service.ProviderService;
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
public class ProviderServiceImpl implements ProviderService {

    @Resource
    ProviderMapper providerMapper;

    @Override
    public Provider getProviderByProviderSign(String providerSign) {
        ProviderExample providerExample = new ProviderExample();
        ProviderExample.Criteria criteria = providerExample.createCriteria();
        criteria.andProviderSignEqualTo(providerSign);
        List<Provider> providers = providerMapper.selectByExample(providerExample);
        if (!CollectionUtils.isEmpty(providers)) return providers.get(0);
        else return null;
    }

    @Override
    public PageInfo<Provider> listProviderByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ProviderExample providerExample = new ProviderExample();
        List<Provider> providerList = providerMapper.selectByExample(providerExample);
        return new PageInfo<>(providerList);
    }

    @Override
    public int insert(Provider provider) {
        provider.setCreateTime(new Date());
        return providerMapper.insert(provider);
    }

    @Override
    public int delete(Integer providerID) {
        return providerMapper.deleteByPrimaryKey(providerID);
    }

    @Override
    public Provider findProviderById(Integer providerID) {
        return providerMapper.selectByPrimaryKey(providerID);
    }

    @Override
    public int change(Provider provider) {
        return providerMapper.updateByPrimaryKeySelective(provider);
    }
}