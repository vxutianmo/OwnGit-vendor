package com.runhang.sell.model.shimao.mbr;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.runhang.sell.model.shimao.common.BirthDay;
import com.runhang.sell.model.shimao.common.IdentifyCard;
import com.runhang.sell.model.shimao.common.RegisterAddress;

import lombok.Data;

@Data
public class Member {
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
	
	private String zip; //(string, optional): 邮编,
	private String fax; //(string, optional): 传真,
	private String telephone; //(string, optional): 电话,
	private String remark; //(string, optional): 备注,
	private String qq; //(string, optional): QQ号,
	private String degree; //(string, optional): 学历,
	private Boolean receiveSM; //(boolean, optional),
	private List<Address> deliveryAddress; //(List[address], optional): 送货地址,
	private String carplateNum; //(string, optional): 车牌号1,
	private String carplateNum2; //(string, optional): 车牌号2,
	private Integer autoReNew; //(int, optional): 是否自动续期,
	private List<MemberChild> memberchild; //(List[memberChild], optional): 会员孩子信息,
	private List<SMemberExtAttribute> extAttributes; //(List[SMemberExtAttribute], optional): 扩展属性，card下才生效，不支持查询会员接口（query）当做查询条件来使用。,
	private BigDecimal remainHour; //(xs_decimal, optional): 剩余停车小时数(仅在查询会员接口query，根据openid，cardid查询会员接口queryMbrByOpenidCardid中有效, 其它接口中为无效值),
	private String accountManagerCode; //(string, optional): 会员客户经理Code，该字段只支持查询。,
	private String accountManagerName; //(string, optional): 会员客户经理Name，该字段只支持查询。,
	private List<ExtCardInfo> extCardInfos; //(List[extCardInfo], optional): 开卡信息
}
