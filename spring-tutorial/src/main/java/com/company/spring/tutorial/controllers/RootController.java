package com.company.spring.tutorial.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.spring.tutorial.dto.SignupForm;
import com.company.spring.tutorial.services.UserService;
import com.company.spring.tutorial.util.MyUtil;

//@RestController
// if you include @RestController it returns a json body by default
// if you write only Controller, you have to include @ResponseBody in te method annotated with @RequestMapping to map the response
@Controller
public class RootController {
	
	private static final Logger logger = LoggerFactory.getLogger(RootController.class);
	
//	@Value("${app.name}")
//	private String appName;
	
	private UserService userService;
	
	@Autowired
	public RootController(UserService userService){
		this.userService=userService;
	}
	
//comment this part after including MvcConfig class
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model){
		model.addAttribute(new SignupForm());
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("signupForm") @Valid SignupForm signupForm, BindingResult result, RedirectAttributes redirectAttributes){
		if(result.hasErrors())
			return "signup";
		
		logger.info(signupForm.toString());
		userService.signup(signupForm);
		
		MyUtil.flash(redirectAttributes, "success", "signupServices");
		
		
		return "redirect:/hello";
	}
}
