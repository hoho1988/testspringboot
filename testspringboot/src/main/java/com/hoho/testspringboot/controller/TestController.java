package com.hoho.testspringboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoho.user.UserTest;

@ConfigurationProperties
@RestController
public class TestController {

	@RequestMapping("/test")
	public UserTest hello(){
//		UserTest u = new UserTest();
		return new UserTest();
	}
}
