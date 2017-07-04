package io.jetbrains.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApp {

	public static void main(String[] args) {
		// Creates servlet container and runs it
		SpringApplication.run(ApiApp.class, args);

	}

}
