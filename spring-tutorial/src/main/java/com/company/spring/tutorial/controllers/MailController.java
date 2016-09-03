package com.company.spring.tutorial.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.spring.tutorial.mail.MailSender;
import com.company.spring.tutorial.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailSender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String sendMail(){
		mailSender.send("ejemplo@124.com", "subject example", "body example");
		
		return "Mail sent";
		
	}
	

}
