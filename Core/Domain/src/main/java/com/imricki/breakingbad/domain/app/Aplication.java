package com.imricki.breakingbad.domain.app;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.imricki.breakingbad.domain.dto.Quote;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger log = LoggerFactory.getLogger(Aplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Aplication.class, args);
	}

	static final int TIMEOUT = 50000;

	@Bean
	RestTemplate restTemplateWithConnectReadTimeout() {
		return new RestTemplateBuilder().setConnectTimeout(Duration.ofMillis(TIMEOUT))
				.setReadTimeout(Duration.ofMillis(TIMEOUT)).build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote[] items = restTemplate.getForObject("https://www.breakingbadapi.com/api/quotes", Quote[].class);

			List<Quote> list = Arrays.asList(items);
			log.info(list.toString());
			System.out.println(list);
		};
	}
}
