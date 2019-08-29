package com.runhang.sell.common;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = -3961708638363668567L;
	protected int code;
	protected String tip;
	protected String error;

	public CommonException(int code) {
		this(code, "操作失败");
	}

	public CommonException(int code, String tip) {
		super(code + "," + tip);
		this.code = code;
		this.tip = tip;
		this.error = tip;
	}

	public CommonException(int code, String tip, String error) {
		super(code + "," + tip + "," + error);
		this.code = code;
		this.tip = tip;
		this.error = error;
	}

	public int getCode() {
		return code;
	}

	public String getTip() {
		return tip;
	}

	public String getError() {
		return error;
	}

	public void setTip(String userMessage) {
		this.tip = userMessage;
	}

	public void setError(String error) {
		this.error = error;
	}

}
