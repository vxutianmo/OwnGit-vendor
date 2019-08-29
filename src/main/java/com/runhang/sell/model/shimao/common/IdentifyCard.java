package com.runhang.sell.model.shimao.common;

import lombok.Data;

@Data
public class IdentifyCard {
	private String type; //(string, optional) = ['idCard' or 'passport' or 'militaryCard' or 'others']: 证件类型,
	private String id; //(string, optional): 证件号
}
