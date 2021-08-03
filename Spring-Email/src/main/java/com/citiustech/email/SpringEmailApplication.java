package com.citiustech.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	/*
	 * @Autowired private static EmailSenderService service;
	 * 
	 * @EventListener(ApplicationReadyEvent.class) public static void triggerMail()
	 * { service.sendSimpleEmail("kiranaher524@gmail.com", "Hi", "Hi"); }
	 */

}
