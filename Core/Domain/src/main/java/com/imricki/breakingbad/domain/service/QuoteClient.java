package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorceHandler;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Service
public class QuoteClient implements QuoteService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.baseurl}")
	private static String BASE_URL;
	@Value(value = "${api.random.quote}")
	private static String RANDOM_QUOTE;

	@Override
	public List<QuoteItem> getAll() {

		List<Quote> unmarshalledList = Arrays
				.asList(this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorceHandler.BASE_URL).build().get()
						.uri(ClientResorceHandler.ALL_QUOTES).retrieve().bodyToMono(Quote[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, QuoteItem.class);

	}

	@Override
	public QuoteItem getRandom() {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(BASE_URL).build().get()
				.uri(RANDOM_QUOTE).retrieve().bodyToFlux(Quote.class).blockFirst();

		System.err.println(unmarshalledQuote);
		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);
	}

	@Override
	public QuoteItem findBy(int id) {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorceHandler.BASE_URL)
				.build().get().uri(ClientResorceHandler.QUOTES_BY_ID + id).retrieve().bodyToFlux(Quote.class)
				.blockFirst();

		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);

	}

}
