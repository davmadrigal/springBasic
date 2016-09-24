package com.company.spring.tutorial.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.company.test.FtpMailSender;

/**
 * 
 * @author damadrigal
 *
 * The @Configuration annotation tells Spring that it's a configuration class. When the application
 * context is built, the methods that are annotated with @Bean inside such configuration classes are called, 
 * and their returnn values are stored as beans
 */
@Configuration
public class MailConfig {
	
	/**
	 * This way can be used when classes were not written by us (third party JAR), we'll not able to
	 * annotate those classes with @component.
	 * @return
	 */
	@Bean
	@Profile("Dev")
	public MailSender mockMailSender(){
		return new MockMailSender();
	}
	
	@Bean
	@Profile("test")
	public MailSender smtpMailSender(){
		return new SmtpMailSender();
	}
	
	@Bean
	@Profile("Prod")
	public MailSender ftpMailSender(){
		return new FtpMailSender();
	}
	

}
