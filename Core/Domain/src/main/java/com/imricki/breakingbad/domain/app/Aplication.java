package com.imricki.breakingbad.domain.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	String s;

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

}
