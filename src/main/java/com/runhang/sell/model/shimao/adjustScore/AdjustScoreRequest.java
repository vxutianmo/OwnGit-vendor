package com.runhang.sell.model.shimao.adjustScore;

import java.util.Date;

import com.runhang.sell.model.shimao.common.AccountAccess;

import lombok.Data;

@Data
public class AdjustScoreRequest {
	private String tranId; //(string, optional): 交易标识，要求系统内唯一，用于唯一确认一笔交易,
	private String xid; //(string, optional): 外部交易标识  该标识为调用方系统交易的唯一标识, 标识的规则可在对接时确定,如 系统标识-门店-流水号. 该标识用于系统间对账或冲账用,

	private Date tranTime; //(Date, optional): 交易时间,
	private AccountAccess account; //(accountAccess, optional): 账户，禁止为null,
	private ScoreRec scoreRec; //(scoreRec, optional): 扣减积分明细,
	private String scoreSource; //(string, optional): 积分来源，业务系统自定义，不能为空,
	private String remark; //(string, optional): 备注,
	private String action; //(string, optional) = ['制卡' or '恢复' or '发售' or '坏卡登记' or '修正卡号' or '卡回收' or '卡成本扣款' or '续卡' or '解锁' or '消费' or '卡升级' or '折扣消费' or '关联主卡' or '修正' or '补发卡' or '旧卡发卡' or '同步' or '修复黑卡' or '会员消费' or '退卡' or '后台消费' or '取消发售' or '修正账面' or '积分同步' or '发卡' or '挂失' or '冻结' or '清卡' or '坏卡销毁' or '积分转移' or '转账' or '圈提' or '发卡清卡' or '作废' or '标记黑卡' or '调整' or '充值' or '恢复计数' or '预存']: 卡动作,
	private String sourceCode; //(string, optional): 来源渠道，非必填，最长64字符；传入调用方的渠道信息
}
