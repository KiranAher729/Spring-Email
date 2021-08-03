package com.citiustech.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {
	
	@Autowired
	EmailSenderService service;
	
	@RequestMapping(path="/send",consumes = "application/json")
	public void sendPasswordToUser(@RequestBody EmailDetails email) {
		
		service.sendSimpleEmail("aherkiran88@gmail.com", email.getBody() , email.getMessage());
	}
}
