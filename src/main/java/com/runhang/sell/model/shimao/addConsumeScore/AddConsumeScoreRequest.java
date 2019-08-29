package com.runhang.sell.model.shimao.addConsumeScore;

import java.math.BigDecimal;
import java.util.Date;

import com.runhang.sell.model.shimao.common.AccountAccess;

import lombok.Data;

@Data
public class AddConsumeScoreRequest {
	private String tranId; //(string, optional): 交易标识，要求系统内唯一，用于唯一确认一笔交易,
	private String xid; //(string, optional): 外部交易标识  该标识为调用方系统交易的唯一标识, 标识的规则可在对接时确定,如 系统标识-门店-流水号. 该标识用于系统间对账或冲账用,

	private Date tranTime; //(Date, optional): 交易时间,
	private AccountAccess account; //(accountAccess, optional): 账户，禁止为null,
	private BigDecimal occur; //(xs_decimal, optional): 消费金额   不能为空,

	private String shposCode; //(string, optional): 商铺代码 可以为空,

	private String source; //(string, optional) = ['online' or 'offline']: 来源（线上online，线下offline），默认offline
}
