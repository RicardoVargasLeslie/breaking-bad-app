package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private RestTemplate restTemplate;

	@Value(value = "${api.random.quote}")
	private String randomQuote;
	@Value(value = "${api.all.quotes}")
	private String allQuotes;
	@Value(value = "${api.quote.by.id}")
	private String quoteByid;

	@Override
	public List<QuoteItem> getAll() {

		ResponseEntity<Quote[]> response = this.restTemplate.getForEntity(this.allQuotes, Quote[].class);
		Quote[] quoteArray = response.getBody();

		List<Quote> quoteList = Arrays.asList(quoteArray);

		return ObjectMapperUtils.mapAll(quoteList, QuoteItem.class);
	}

	@Override
	public QuoteItem getRandom() {

		return null;
	}

	@Override
	public QuoteItem findBy(int id) {

		return null;

	}

}
