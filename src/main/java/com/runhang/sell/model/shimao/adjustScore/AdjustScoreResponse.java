package com.runhang.sell.model.shimao.adjustScore;


import java.math.BigDecimal;

import lombok.Data;

@Data
public class AdjustScoreResponse {
	private String flowNo; //(string, optional): 流水号,
	private BigDecimal scoreTotal; //(xs_decimal, optional): 调整后总积分
}
