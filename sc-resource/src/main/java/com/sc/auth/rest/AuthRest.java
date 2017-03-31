package com.sc.auth.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sc.auth.bean.Result;
import com.sc.auth.bean.ResultBuilder;

@RestController
@RequestMapping(value="auth")
public class AuthRest {

	
	@RequestMapping(value="get", method=RequestMethod.GET)
	public Result<Object> get(){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("resources", "menu1,menu2,menu3");
		return ResultBuilder.buildSuccessResult(map);
	}
}
