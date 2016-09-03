package com.company.spring.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.test.FtpMailSender;

@SpringBootApplication(scanBasePackageClasses ={SpringTutorialApplication.class,FtpMailSender.class})
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
	}
}
