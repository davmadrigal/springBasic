package com.company.spring.tutorial.mail;

public interface MailSender {

	void send (String to, String subject, String body);
}
