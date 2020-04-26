package com.example.message.gateway.service;

import com.example.message.gateway.entity.bo.MessageContext;

import java.util.Map;

public interface PushService {

    Map<String, Object> push(MessageContext messageContext);

}