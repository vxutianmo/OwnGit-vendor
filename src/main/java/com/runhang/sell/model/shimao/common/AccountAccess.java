package com.runhang.sell.model.shimao.common;

import lombok.Data;

@Data
public class AccountAccess {
    private String type;  // ['cardNum' or 'mobile' or 'memberId' or 'idCard' or 'magBar' or 'dynamicAccountId']: 账户类型，非空,
    private String id;    // 账户标识，非空
    
    public static enum Type {
    	cardNum("cardNum"), mobile("mobile"), memberId("memberId"), idCard("idCard"), magBar("magBar"), dynamicAccountId("dynamicAccountId");
    	private String type;
    	
    	private Type(String type) {
    		this.type = type;
    	}
    	
        public String getType() {  
            return type;  
        }  
        public void setType(String type) {  
            this.type = type;  
        }      	
    }
}
