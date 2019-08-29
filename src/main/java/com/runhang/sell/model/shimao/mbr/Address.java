package com.runhang.sell.model.shimao.mbr;

import lombok.Data;

@Data
public class Address {
	private String uuid;//(string, optional): 全局唯一标识。,
	private Boolean defaultAddr;//(boolean),
	private String contact;//(string, optional): 联系人,
	private String cellphone;//(string, optional): 手机号,
	private String memberId;//(string, optional): 会员标识,
	private Integer order;//(int): 序号,
	private String province;//(string, optional): 省市,
	private String city;//(string, optional): 市区,
	private String district;//(string, optional): 区县,
	private String address;//(string, optional): 详细地址,
	private String postcode;//(string, optional): 邮编
}
