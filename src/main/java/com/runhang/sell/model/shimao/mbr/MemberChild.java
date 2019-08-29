package com.runhang.sell.model.shimao.mbr;

import java.util.Date;

import lombok.Data;

@Data
public class MemberChild {
	private String childName; //(string, optional): 孩子姓名 不允许为空，最大长度25字符,
	private String childSex;//(string, optional): 孩子性别 可选值：男；女；保密。不允许其他值，不允许为空,
	private Date birthday;//(Date, optional): 孩子出生日期 不能大于当前日期，不允许为空，
}
