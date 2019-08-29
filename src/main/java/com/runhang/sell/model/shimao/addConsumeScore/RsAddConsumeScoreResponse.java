package com.runhang.sell.model.shimao.addConsumeScore;

import lombok.Data;

@Data
public class RsAddConsumeScoreResponse {
	private Integer errorCode; //(int): 异常代码,
	private String message; //(string, optional): 异常描述,
	private String stackTrace; //(string, optional): 异常调试信息，只有在服务器开启Debug模式时才有效,
	private AddConsumeScoreResponse response;//(addConsumeScoreResponse, optional)
}
