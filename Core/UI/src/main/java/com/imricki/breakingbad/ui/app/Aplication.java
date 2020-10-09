package com.imricki.breakingbad.ui.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.imricki.breakingbad.domain.service.QuoteClient;

import javafx.application.Application;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Aplication.class);

	@Autowired
	QuoteClient client;

	public static void main(String[] args) {

		Application.launch(FxAppication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

//			this.client.getAll().forEach(e -> System.out.println(e));

		};
	}
}
