package com.imricki.breakingbad.ui.app;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.imricki.breakingbad.domain.dto.Quote;

import javafx.application.Application;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Aplication.class);

	public static void main(String[] args) {

		LOGGER.info("Firee up Main");

		Application.launch(FxAppication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

			RestTemplate restTemplate = new RestTemplate();

			ResponseEntity<Quote[]> response = restTemplate.getForEntity("https://www.breakingbadapi.com/api/quotes",
					Quote[].class);
			Quote[] Quote = response.getBody();

			List<Quote> quotes = Arrays.asList(Quote);

			quotes.forEach(e -> System.out.print(e));
		};
	}
}
