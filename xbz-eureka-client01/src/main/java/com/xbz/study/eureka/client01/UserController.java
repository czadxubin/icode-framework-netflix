package com.xbz.study.eureka.client01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value="/")
	public String hello() {
		return "hello world";
	}
}
