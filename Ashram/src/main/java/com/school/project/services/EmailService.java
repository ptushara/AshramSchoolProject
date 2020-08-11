package com.school.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	@Autowired
	private MailSender sendEmail; // MailSender interface defines a strategy
	// for sending simple mails

	public void sendEmail(String toAddress, String fullname) {

		SimpleMailMessage crunchifyMsg = new SimpleMailMessage();
		String fromAddress="tushara.patneedi@gmail.com";
		String subject="Welcome to Ahsram";
		String msgBody="Hi "+fullname+"! You are succesfully logged in";
		crunchifyMsg.setFrom(fromAddress);
		crunchifyMsg.setTo(toAddress);
		crunchifyMsg.setSubject(subject);
		crunchifyMsg.setText(msgBody);
		sendEmail.send(crunchifyMsg);
	}
}
