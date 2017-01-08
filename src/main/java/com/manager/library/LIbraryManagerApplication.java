package com.manager.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LIbraryManagerApplication {
	
	@Autowired
	private DataLoader dataLoader;

	public static void main(String[] args) {
		SpringApplication.run(LIbraryManagerApplication.class, args);
	}
}
