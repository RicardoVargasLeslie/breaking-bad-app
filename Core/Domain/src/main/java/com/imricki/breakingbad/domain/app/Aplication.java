package com.imricki.breakingbad.domain.app;

import java.time.Duration;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.restclient.RestClientService;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger log = LoggerFactory.getLogger(Aplication.class);

	@Autowired
	private RestClientService service;

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
	public CommandLineRunner run() throws Exception {
		return args -> {

			List<Quote> list = this.service.getAllQuotes();
			list.forEach(System.out::println);

		};
	}
}
