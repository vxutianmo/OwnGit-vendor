package com.runhang.sell.model.shimao.addConsumeScore;

import com.runhang.sell.model.shimao.common.JCRMOperateContext;

import lombok.Data;

@Data
public class RsAddConsumeScoreRequest {
	private JCRMOperateContext operCtx; //(JCRMOperateContext, optional): 请求上下文环境,
	private AddConsumeScoreRequest request; //(addConsumeScoreRequest, optional)
}
