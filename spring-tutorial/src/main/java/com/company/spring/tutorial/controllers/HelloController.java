package com.company.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
// if you include @RestController it returns a json body by default
// if you write only Controller, you have to include @ResponseBody in te method annotated with @RequestMapping to map the response
@Controller
public class HelloController {
	
	@Value("${app.name}")
	private String appName;
	
//comment this part after including MvcConfig class
//	@RequestMapping("/hello")
//	public String hello(){
//		return "hello";
//	}
}
