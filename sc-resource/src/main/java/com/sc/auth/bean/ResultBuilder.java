package com.sc.auth.bean;

public class ResultBuilder {
	
	public static <T> Result<T> buildSuccessResult(T t){
		Result<T> result = new Result<T>();
		result.setBody(t);
		result.setSuccess(true);
		result.setCode(Result.SUCCESS_CODE);
		result.setResultMsg(Result.SUCCESS_MSG);
		return result;
	}
	
	public static <T> Result<T> buildSuccessResult(){
		return buildSuccessResult(null);
	}
	

	public static <T> Result<T> buildFailedResult(T t){
		Result<T> result = new Result<T>();
		result.setBody(t);
		result.setSuccess(false);
		result.setCode(Result.FAILED_CODE);
		result.setResultMsg(Result.FAILED_MSG);
		return result;
	}
	
	public static <T> Result<T> buildFailedResult(int code, String resultMsg){
		Result<T> result = buildFailedResult(null);
		result.setCode(code);
		result.setResultMsg(resultMsg);
		return result;
	}
	
	public static <T> Result<T> buildFailedResult(){
		return buildFailedResult(null);
	}
}
