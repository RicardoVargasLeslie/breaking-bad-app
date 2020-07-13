package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ConfigurationProperties
public class QuoteClient implements QuoteService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.base.url}")
	private String BASE_URL;
	@Value(value = "${api.random.quote}")
	private String RANDOM_QUOTE;
	@Value(value = "${api.all.quotes}")
	private String ALL_QUOTES;
	@Value(value = "${api.quote.by.id}")
	private String QUOTE_BY_ID;

	@Override
	public List<QuoteItem> getAll() {

		List<Quote> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL)
				.build().get().uri(this.ALL_QUOTES).retrieve().bodyToMono(Quote[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, QuoteItem.class);

	}

	@Override
	public QuoteItem getRandom() {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL).build().get()
				.uri(this.RANDOM_QUOTE).retrieve().bodyToFlux(Quote.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);
	}

	@Override
	public QuoteItem findBy(int id) {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL).build().get()
				.uri(this.QUOTE_BY_ID + id).retrieve().bodyToFlux(Quote.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);

	}

}
