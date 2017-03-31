package com.sc.user.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sc.user.bean.Result;
import com.sc.user.bean.ResultBuilder;

@RestController
@RequestMapping(value="user")
public class UserRest {

	@RequestMapping(value="get", method=RequestMethod.GET)
	public Result<Object> get(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "zhubin");
		return ResultBuilder.buildSuccessResult(map);
	}
}
