package com.runhang.sell.model.shimao.common;

import lombok.Data;

/**
 * 会员生日
 * @author: wt@runhang 
 * @date:   2019年1月11日 下午5:48:55   
 * @Copyright: 2019 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class BirthDay {
	private Integer year; //(int): 生日年份，实际年份（not 1900 based）,
	private Integer month; //(int): 生日月份: 1~12,
	private Integer day; //(int): 生日天份: 1~31
}
