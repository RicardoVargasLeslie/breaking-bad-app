package com.imricki.breakingbad.domain.app;

import java.time.Duration;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.imricki.breakingbad.domain.dto.Quote;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger log = LoggerFactory.getLogger(Aplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.setConnectTimeout(Duration.ofSeconds(500)).setReadTimeout(Duration.ofSeconds(500)).build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			restTemplate.setConnectTimeout(Duration.ofSeconds(500)).setReadTimeout(Duration.ofSeconds(500));

			List<Quote> quote;
			ResponseEntity<Quote[]> response = restTemplate.getForEntity("https://www.breakingbadapi.com/api/quotes",
					Quote[].class);
			Quote[] employees = response.getBody();

			for (int i = 0; i < employees.length; i++) {

				System.out.println(employees[i]);
			}
		};
	}
}
