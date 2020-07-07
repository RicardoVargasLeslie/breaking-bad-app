package com.imricki.breakingbad.domain.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.dto.Character;
import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.restclient.resorce.ClientResorces;

@Service
public class Client {

	@Autowired
	private ClientBuilder clientBuilder;

	public List<Quote> getAllQuotes() {

		Quote[] quotes = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_QUOTES).retrieve().bodyToMono(Quote[].class).block();

		return Arrays.asList(quotes);

	}

	public List<Character> getAllCharacters() {

		Character[] characters = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_QUOTES).retrieve().bodyToMono(Character[].class).block();

		return Arrays.asList(characters);

	}

	public Character getRandomCharacter() {

		return this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.RANDOM_CHARACTER).retrieve().bodyToMono(Character.class).block();

	}

	public Quote getRandomQuote() {

		return this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.RANDOM_QUOTE).retrieve().bodyToMono(Quote.class).block();

	}

}
