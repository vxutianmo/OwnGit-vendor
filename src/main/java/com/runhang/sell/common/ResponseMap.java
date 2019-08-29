package com.runhang.sell.common;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/** 对结果集的封装 */
public class ResponseMap {

	private Map<String, Object> result;
	private Map<String, Object> data;
	private int code;

	private ResponseMap(int code) {
		result = new HashMap<String, Object>();
		data = new HashMap<String, Object>();
		this.code = code;
		result.put("code", code + "");
		result.put("data", data);
	}
	public static ResponseMap addData(String tip,Object data) {
		return new ResponseMap(0,data).setTip(tip);
	}
	private ResponseMap(int code,Object data) {
		result = new HashMap<String, Object>();
		this.code = code;
		result.put("code", code + "");
		result.put("data", data);
	}

	public static ResponseMap success(String tip) {
		return new ResponseMap(0).setTip(tip);
	}

	public static ResponseMap error(int errCode, String tip) {
		return new ResponseMap(errCode).setTip(tip);
	}

	public static ResponseMap error(int errCode, String tip, String errMsg) {
		return error(errCode, tip).setErrMsg(errMsg);
	}

	public ResponseMap setTip(String tip) {
		this.result.put("message", tip);
		return this;
	}

	public ResponseMap setErrMsg(String errMsg) {
		this.result.put("error", errMsg);
		return this;
	}

	public ResponseMap data(String key, Object value) {
		if (key != null && value != null) {
			this.data.put(key, value);
		}
		return this;
	}

	public ResponseMap setDataMap(Map<String,Object> data){
		this.result.put("data",data);
		return this;
	}

	public Map<String, Object> result() {
		return result;
	}

	public JSONObject resultJSON() {
		return new JSONObject(this.result);
	}

	public int getCode() {
		return this.code;
	}

	@Override
	public String toString() {
		return "ResponseMap{" +
				"result=" + result +
				", data=" + data +
				", code=" + code +
				'}';
	}
}
