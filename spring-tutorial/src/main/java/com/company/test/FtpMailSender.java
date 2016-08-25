package com.company.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.company.spring.tutorial.mail.MailSender;

@Qualifier("ftp")
@Component
public class FtpMailSender implements MailSender{
	
	private static final Log log = LogFactory.getLog(FtpMailSender.class);

	@Override
	public void send(String to, String subject, String body) {
		// TODO Auto-generated method stub
		log.info("Ftp to "+to);
		log.info("Ftp subject to "+subject);
		log.info("Ftp body "+body);
		
		
	}

}
