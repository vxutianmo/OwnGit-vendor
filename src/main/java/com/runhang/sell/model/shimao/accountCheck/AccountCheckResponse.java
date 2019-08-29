package com.runhang.sell.model.shimao.accountCheck;

import com.runhang.sell.model.shimao.common.Card;
import com.runhang.sell.model.shimao.common.DesAccount;
import com.runhang.sell.model.shimao.common.ScoreAccount;

import lombok.Data;

@Data
public class AccountCheckResponse {
	private Card cardInfo; //(card, optional): 卡信息,
	private DesAccount desAccount;//(desAccount, optional): 储值账户,
	private ScoreAccount scoreAccount; //(scoreAccount, optional): 积分账户,
	private SimpleMember member;//(simpleMember, optional): 会员信息
}
