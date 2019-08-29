package com.runhang.sell.model.shimao.adjustScore;

import com.runhang.sell.model.shimao.common.JCRMOperateContext;

import lombok.Data;

@Data
public class RsAdjustScoreRequest {
	private JCRMOperateContext operCtx; //(JCRMOperateContext, optional): 请求上下文环境,
	private AdjustScoreRequest request;
}
