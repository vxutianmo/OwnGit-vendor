package com.runhang.sell.model.shimao.adjustScore;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ScoreRec {
	private String scoreType; //(string, optional): 积分类别，默认需传入"-"；,
	private String scoreSubject; //(string, optional) = ['消费' or '储值' or '加速' or '调整' or '转出' or '转入' or '兑奖' or '积分清理' or '抵扣' or '注册'],
	private BigDecimal score;//(xs_decimal, optional)
}
