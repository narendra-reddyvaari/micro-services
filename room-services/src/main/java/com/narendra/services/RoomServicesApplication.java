package com.narendra.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Narendra Reddyvaari
 *
 */
@ComponentScan("com.narendra.services")
@SpringBootApplication
public class RoomServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomServicesApplication.class, args);
	}
}
