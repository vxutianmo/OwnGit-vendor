package com.runhang.sell.model.shimao.accountCheck;

import java.math.BigDecimal;
import java.util.Date;

import com.runhang.sell.model.shimao.common.BirthDay;
import com.runhang.sell.model.shimao.common.IdentifyCard;
import com.runhang.sell.model.shimao.common.RegisterAddress;

import lombok.Data;

/**
 * 世贸会员信息
 * @author: wt@runhang 
 * @date:   2019年1月11日 下午5:47:16   
 * @Copyright: 2019 www.runhangtech.com Inc. All rights reserved.
 */
@Data
public class SimpleMember {
	private String id; //(string, optional): 会员标识 新增会员时为空,

	private String name; //((string, optional): 会员名称,
	private String gender; //((string, optional) = ['male' or 'female' or 'unknown']: 性别,
	private BirthDay birthday; //((birthday, optional): 生日,
	private String cellphone; //((string, optional): 手机号,
	private String email; //((string, optional): 电子邮箱,
	private IdentifyCard idCard; //((identifyCard, optional): 证件,
	private String belongStore; //((string, optional): 所属门号标识,
	private String belongCenter; //((string, optional): 所属中心标识,
	private String wedLock; //(string, optional) = ['married' or 'single' or 'secret']: 婚姻状况,
    private String grade; //((string, optional): 会员等级代码,
    private String gradeName; //((string, optional): 会员等级名称,
    private String address; //((string, optional): 家庭常住地址,
	private Boolean mobileChecked; //((boolean, optional): 手机是否校验,
	private String lastUpdateTime; //((string, optional): 最后更新时间,
	private RegisterAddress registerAddress; //((registerAddress, optional): 注册地址,
	private Date gradeValidate; //((Date, optional): 会员等级有效期:只支持查询，不支持编辑。,
	private Date createTime; //((Date, optional): 创建时间,
	private String status; //((string, optional) = ['UNACTIVATED' or 'NORMAL' or 'FROZEN' or 'DELETED' or 'RETRUNED']: 会员状态,
	private String mbrSource; //((string, optional): 传入会员来源代码,
	private BigDecimal favAmt; //((xs_decimal, optional): 优惠金额 (仅crm支持)
}
