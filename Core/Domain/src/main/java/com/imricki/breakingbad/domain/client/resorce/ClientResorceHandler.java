package com.imricki.breakingbad.domain.client.resorce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Configuration
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@PropertySource("classpath:application.properties")
public class ClientResorceHandler {

	@Value("${api.baseurl}")
	public static final String BASE_URL = "";

	public static final String ALL_CHARACTERS = "/api/characters";

	public static final String RANDOM_CHARACTER = "/api/character/random";

	public static final String RANDOM_DEATHS = "/api/deaths/random";

	public static final String DEATHS_COUNT = "/api/death-count";

	public static final String ALL_EPISODES = "/api/episodes";

	public static final String ALL_QUOTES = "/api/quotes";

	public static final String QUOTES_BY_ID = "";

	public static final String RANDOM_QUOTE = "/api/quote/random";

	public static final String ALL_DEATHS = "/api/deaths";

}
