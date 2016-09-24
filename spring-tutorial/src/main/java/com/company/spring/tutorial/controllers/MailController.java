package com.company.spring.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.spring.tutorial.mail.MailSender;

@RestController
public class MailController {
	
	
	//private MailSender mailSender = new MockMailSender();
	//@Resource(name="smtpMailSender")
	private MailSender mailSender;
	
	/**
	 * 
	 * @param mailSender
	 * Resource annotation can be use also with Setter methods
	 * 
	 */
//	@Resource
//	
//	public void setMailSender(MailSender mailSender){
//		this.mailSender = mailSender;
//	}
	/**
	 * 
	 * @param mailsender
	 * 
	 * Autowired is more powerful, it can be used with any methods, including constructors
	 * in fact, with SpringBoot 1.4, with a single constructor, Spring will automatically autowire its parameters
	 * @param mailSender 
	 */
	//@Autowired
	public MailController( MailSender mailSender){
		this.mailSender = mailSender;
	}
	
	
	
	@RequestMapping("/mail")
	public String sendMail(){
		mailSender.send("ejemplo@124.com", "subject example", "body example");
		
		return "Mail sent";
		
	}
	

}
