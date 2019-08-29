package com.runhang.sell.model.shimao.accountCheck;

import lombok.Data;

@Data
public class RsAccountCheckResponse {
    private Integer errorCode; //异常代码
    private String message;    //异常描述
    private String stackTrace; //异常调试信息
    private AccountCheckResponse response;
    
}
