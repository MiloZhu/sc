package com.sc.auth.bean;

public class Result <T>{
	
	public static final String SUCCESS_MSG = "操作成功";
	
	public static final int SUCCESS_CODE = 0;
	
	public static final String FAILED_MSG = "操作失败";
	
	public static final int FAILED_CODE = 1;
	
	private boolean success = true;
	private Integer code = SUCCESS_CODE;
	private String resultMsg = SUCCESS_MSG;
	private T body;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public T getBody() {
		return body;
	}
	public void setBody(T body) {
		this.body = body;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
}
