package com.runhang.sell.model.shimao.common;

import lombok.Data;

@Data
public class RegisterAddress {
	private String provinceCode; //(string, optional): 省/市代码  可以为空,

	private String provinceName; //(string, optional): 省/市名称 可以为空,

	private String cityCode; //(string, optional): 市/区代码 可以为空,

	private String cityName; //(string, optional): 市/区名称 可以为空,

	private String districtCode; //(string, optional): 区县代码 可以为空,

	private String districtName; //(string, optional): 区县名称 可以为空
}
