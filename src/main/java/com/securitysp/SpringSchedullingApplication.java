package com.securitysp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringSchedullingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSchedullingApplication.class, args);
	}

}
