package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements IEmailServicelmpl{

	 @Autowired
	    private JavaMailSender emailSender;

	    public void sendSimpleMessage(
	      String to, String subject, String text) {
	        
	        SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setFrom("mouezghariani2@gmail.com");
	        message.setTo(to); 
	        message.setSubject(subject); 
	        message.setText(text);
	        emailSender.send(message);
	        System.out.println("mail send succesuly !");
	       
	    }
}
