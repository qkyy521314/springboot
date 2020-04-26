package com.example.message.gateway.service;

import com.example.message.gateway.entity.po.Provider;
import com.github.pagehelper.PageInfo;

public interface ProviderService {

    Provider getProviderByProviderSign(String providerSign);

    PageInfo<Provider> listProviderByPage(int pageNum, int pageSize);

    int insert(Provider provider);

    int delete(Integer providerID);

    Provider findProviderById(Integer providerID);

    int change(Provider provider);
}
