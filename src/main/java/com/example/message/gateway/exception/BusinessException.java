package com.example.message.gateway.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessException extends RuntimeException {

    //异常状态码
    private Integer code;

    //异常信息
    private String message;

    //第三方异常返回
    private Object data;

}
