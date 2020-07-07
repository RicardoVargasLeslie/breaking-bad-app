package com.imricki.breakingbad.domain.restclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.restclient.resorce.ClientResorces;

@Service
public class RestClientService {

	@Autowired
	private WebClient.Builder webClientBuilder;

	public List<Quote> getAllQuotes() {

		Quote[] quotes = this.webClientBuilder.baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_QUOTES).retrieve().bodyToMono(Quote[].class).block();

		return Arrays.asList(quotes);

	}

}
