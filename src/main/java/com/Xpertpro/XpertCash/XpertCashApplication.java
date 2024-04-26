package com.Xpertpro.XpertCash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class XpertCashApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(XpertCashApplication.class , args);
	}
}
