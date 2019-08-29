package com.runhang.sell.model.shimao.common;

import java.util.Date;

import lombok.Data;

@Data
public class Card {
	private String cardNum; //(string, optional): 卡号,
	private Date beginTime; //(Date, optional): 发售时间,
	private Date bytime; // (Date, optional): 有效期,
	private String cardType; //(string, optional): 卡类型代码,
	private String cardTypeName; //(string, optional): 卡类型名称,
	private String carrier; //(string, optional): 持卡人标识,
	private String state; //(string, optional) = ['使用中' or '已挂失' or '已作废' or '已补发卡' or '已退卡' or '已冻结' or '未激活' or '已坏卡登记' or '已销毁' or '已制卡' or '已发卡' or '已核对' or '已回收' or '空卡' or '异常' or '已损卡']: 卡状态,
	private String belongCenter; //(string, optional): 卡所属中心,
	private String cardFunction; //(string, optional): 卡功能
}
