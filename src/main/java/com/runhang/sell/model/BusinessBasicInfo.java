package com.runhang.sell.model;

import lombok.Data;

import java.util.List;

/**
 * 商户基本信息
 * 个人商户和公司商户的公共信息
 * @author: wt@runhang 
 * @date:   2018年7月25日 上午10:11:51   
 * @Copyright: 2018 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class BusinessBasicInfo {
	//id
	private Integer id;
	//商户名称
	private String name;
	//商户类型
	private String type;
	//地址
	private String address;
	//联系电话
	private String phone;
	//证件类型
	private String certType;
	//证件号
	private String certNum;
	//合作方式
	private CopType copType;
	//余额
	private Long balance;
	//总额
	private Long total;
	//商户登录id
	private Integer userId;
	//父商户
	private BusinessBasicInfo parent;
	//子商户
	private List<BusinessBasicInfo> children;
	//状态
	private String status;
}
