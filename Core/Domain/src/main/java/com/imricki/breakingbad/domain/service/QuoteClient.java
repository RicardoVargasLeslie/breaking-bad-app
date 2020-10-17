package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.imricki.breakingbad.domain.dto.Quote;
import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
@ConfigurationProperties
public class QuoteClient implements QuoteService {

	private RestTemplate restTemplate = new RestTemplate();

	@Value(value = "${api.base.url}")
	private String baseUrl;
	@Value(value = "${api.random.quote}")
	private String randomQuote;
	@Value(value = "${api.all.quotes}")
	private String allQuotes;
	@Value(value = "${api.quote.by.id}")
	private String quoteByid;

	@Override
	public List<QuoteItem> getAll() {

		ResponseEntity<Quote[]> response = this.restTemplate.getForEntity("https://www.breakingbadapi.com/api/quotes",
				Quote[].class);
		Quote[] Quote = response.getBody();

		List<Quote> quotes = Arrays.asList(Quote);

		return ObjectMapperUtils.mapAll(quotes, QuoteItem.class);
	}

	@Override
	public QuoteItem getRandom() {

//		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
//				.uri(this.randomQuote).retrieve().bodyToFlux(Quote.class).blockFirst();
//
		return null;
	}

	@Override
	public QuoteItem findBy(int id) {

//		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
//				.uri(this.quoteByid + id).retrieve().bodyToFlux(Quote.class).blockFirst();
//
//		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);
		return null;

	}

}
