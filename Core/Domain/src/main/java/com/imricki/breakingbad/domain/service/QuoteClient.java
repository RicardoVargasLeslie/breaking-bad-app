package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Quote;

@Service
public class QuoteClient implements QuoteService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Quote> getAll() {

		return Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_QUOTES).retrieve().bodyToMono(Quote[].class).block());
	}

	@Override
	public Quote getRandom() {

		return this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.RANDOM_QUOTE).retrieve().bodyToFlux(Quote.class).blockFirst();
	}

	@Override
	public Quote findBy(int id) {

		return this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.QUOTES_BY_ID + id).retrieve().bodyToFlux(Quote.class).blockFirst();

	}

}
