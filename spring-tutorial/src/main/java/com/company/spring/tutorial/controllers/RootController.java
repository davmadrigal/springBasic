package com.company.spring.tutorial.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.spring.tutorial.dto.SignupForm;

//@RestController
// if you include @RestController it returns a json body by default
// if you write only Controller, you have to include @ResponseBody in te method annotated with @RequestMapping to map the response
@Controller
public class RootController {
	
	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	
	@Value("${app.name}")
	private String appName;
	
//comment this part after including MvcConfig class
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model){
		model.addAttribute(new SignupForm());
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("signupForm") @Valid SignupForm signupForm, BindingResult result){
		if(result.hasErrors())
			return "signup";
		
		logger.info(signupForm.toString());
		return "redirect:/hello";
	}
}
