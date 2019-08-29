package com.runhang.sell.model.shimao.addConsumeScore;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AddConsumeScoreResponse {
	private BigDecimal totalScore; //(xs_decimal, optional): 总积分,
	private BigDecimal currScore; //(xs_decimal, optional): 本次积分
}
