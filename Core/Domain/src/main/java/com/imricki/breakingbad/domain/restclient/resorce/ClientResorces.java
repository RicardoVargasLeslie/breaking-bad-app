package com.imricki.breakingbad.domain.restclient.resorce;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ClientResorces {

	public static final String BASE_URL = "https://www.breakingbadapi.com";

	public static final String ALL_CHARACTERS = "/api/characters";

	public static final String RANDOM_CHARACTER = "/api/character/random";

	public static final String ALL_EPISODES = "/api/episodes";

	public static final String ALL_QUOTES = "/api/quotes";

	public static final String RANDOM_QUOTE = "/api/quote/random";

	public static final String ALL_DEATHs = "/api/deaths";

}
