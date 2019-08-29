package com.runhang.sell.model.shimao.mbr;

import lombok.Data;

@Data
public class SMemberExtAttribute {
	private String key; //(string, optional): 会员属性键值 key = 会员扩展资料代码 + "_" + 会员扩展资料属性代码; 会员扩展资料代码和会员扩展资料属性代码可通过调用 "取得当前可用的会员扩展字段（/mbr/getMemberExt）"接口来获取。,
	private String value;//(string, optional): 属性值 (在saveMemberExts和saveModify接口中若key存在，vale为空，表示不更新，仍为原来的值；若key不存在，vale为空，会员扩展信息属性允许为空，则置value值为空。)
}
