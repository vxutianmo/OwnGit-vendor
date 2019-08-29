package com.runhang.sell.model.shimao.accountCheck;

import com.runhang.sell.model.shimao.common.AccountAccess;
import com.runhang.sell.model.shimao.common.JCRMOperateContext;

import lombok.Data;

@Data
public class RsAccountCheckRequest {
	private JCRMOperateContext operCtx;
	private AccountAccess accout;
}
