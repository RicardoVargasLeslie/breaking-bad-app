package com.imricki.breakingbad.domain.clientbuilder;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientBuilder {

	@Bean
	public WebClient.Builder getWebClientBuilder() {

		return WebClient.builder();
	}

}
