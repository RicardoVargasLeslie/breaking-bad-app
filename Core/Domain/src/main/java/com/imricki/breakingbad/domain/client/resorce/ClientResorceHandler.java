package com.imricki.breakingbad.domain.client.resorce;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Configuration
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@PropertySource("classpath:url.properties")
public class ClientResorceHandler implements InitializingBean {

	@Value("${api.baseurl}")
	public static String BASE_URL;

	public static String ALL_CHARACTERS = "/api/characters";

	public static String RANDOM_CHARACTER = "/api/character/random";

	public static String RANDOM_DEATHS = "/api/deaths/random";

	public static String DEATHS_COUNT = "/api/death-count";

	public static String ALL_EPISODES = "/api/episodes";

	public static String ALL_QUOTES;

	public static String QUOTES_BY_ID = "/api/quotes/";
	@Value("${api.random.quote}")
	public static String RANDOM_QUOTE;

	public static String ALL_DEATHS = "/api/deaths";

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("in afterPropertiesSet via @Value: " + ClientResorceHandler.BASE_URL);

	}

}
