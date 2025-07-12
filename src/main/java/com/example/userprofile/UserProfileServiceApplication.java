package com.example.userprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the User Profile Service application.
 * This class initializes and runs the Spring Boot application.
 */
@SpringBootApplication
public class UserProfileServiceApplication {

	/**
	 * Main method to start the User Profile Service application.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(UserProfileServiceApplication.class, args);
	}
}