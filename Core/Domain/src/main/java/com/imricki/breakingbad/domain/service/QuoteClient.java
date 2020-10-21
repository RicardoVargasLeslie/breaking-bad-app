package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

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
	private RestTemplate restTemplate=new RestTemplate();

	@Value(value = "${api.random.quote}")
	private String randomQuote;
	@Value(value = "${api.all.quotes}")
	private String allQuotes;
	@Value(value = "${api.quote.by.id}")
	private String quoteByid;

	@PostConstruct
	@Override
	public List<QuoteItem> getAll() {

		//		ResponseEntity<Quote[]> response =
		//				this.restTemplate.getForEntity(this.allQuotes, Quote[].class);
		//		Quote[] quoteArray = response.getBody();
		//		List<Quote> quoteList = Arrays.asList(quoteArray);

		ResponseEntity<Quote[]> response = this.restTemplate.getForEntity(this.allQuotes, Quote[].class);
		Quote[] quoteArray = response.getBody();

		List<Quote> quoteList = Arrays.asList(quoteArray);

		quoteList.forEach(e-> System.out.println(e.toString()));
		return ObjectMapperUtils.mapAll(quoteList, QuoteItem.class);
	}

	@Override
	public QuoteItem getRandom() {

		ResponseEntity<Quote> response =
				this.restTemplate.getForEntity(this.randomQuote, Quote.class);
		return ObjectMapperUtils.map(response.getBody(), QuoteItem.class);
	}

	@Override
	public QuoteItem findBy(int id) {

		ResponseEntity<Quote> response =
				this.restTemplate.getForEntity(this.quoteByid, Quote.class);
		return ObjectMapperUtils.map(response.getBody(), QuoteItem.class);
	}

}
