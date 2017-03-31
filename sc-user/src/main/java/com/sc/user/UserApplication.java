package com.sc.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class UserApplication {
	
	public static void main(String[] args){
		new SpringApplicationBuilder(UserApplication.class).web(true).run(args);
	}

}
