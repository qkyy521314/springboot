package com.example.message.gateway.entity.bo;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class MessageContext {

    String mID;

    @NotNull(message = "appKey 不能为空, 请联系管理员配置")
    String appKey;

    Message message;

    //设置目标 极光Push--roomID   SMS---mobile
    List<String> tags;
}
