package com.company.spring.tutorial;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.company.test.FtpMailSender;

@SpringBootApplication(scanBasePackageClasses ={SpringTutorialApplication.class,FtpMailSender.class})
public class SpringTutorialApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringTutorialApplication.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringTutorialApplication.class, args);
		
//		logger.info("Beans in application context:");
//		
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		
//		Arrays.sort(beanNames);
//		
//		for (String bean: beanNames){
//			logger.info(bean);
//		}
		
	}
}
