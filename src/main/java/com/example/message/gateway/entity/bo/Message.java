package com.example.message.gateway.entity.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@ApiModel("Content")
public class Message {

    //公用
    @NotNull(message = "content 内容不能为空")
    @ApiModelProperty(value = "content", required = true)
    String content;

    //
}
