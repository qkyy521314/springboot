package com.example.message.gateway.entity.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("Result")
public class Response {

    @ApiModelProperty(value = "code 200为成功，其余为失败")
    Integer code = 200;

    @ApiModelProperty(value = "调用结果")
    String message = "请求成功";

    @ApiModelProperty(value = "调用第三方结果")
    Object data;

    public Response() {}

    public Response(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
