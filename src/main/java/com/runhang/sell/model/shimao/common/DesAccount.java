package com.runhang.sell.model.shimao.common;

import java.math.BigDecimal;

import lombok.Data;

/**
 * 储值账户
 * @author: wt@runhang 
 * @date:   2019年1月11日 下午5:42:40   
 * @Copyright: 2019 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class DesAccount {
	private String currency;//(string, optional): 币种，本系统只支持人民币,
	private BigDecimal balance; //(xs_decimal, optional): 余额，单位 分
}
