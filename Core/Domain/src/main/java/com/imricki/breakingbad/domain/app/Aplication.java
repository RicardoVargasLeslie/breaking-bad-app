package com.imricki.breakingbad.domain.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.imricki.breakingbad.domain.client.Client;
import com.imricki.breakingbad.domain.dto.Quote;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger log = LoggerFactory.getLogger(Aplication.class);

	@Autowired
	private Client service;

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

			Quote q = this.service.getRandomQuote();

			System.err.println(q);
//			List<Quote> list = this.service.getAllQuotes();
//			list.forEach(System.out::println);

		};
	}
}
