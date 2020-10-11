package com.imricki.breakingbad.domain.service;

import java.util.ArrayList;
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

@Service
@ConfigurationProperties
public class QuoteClient implements QuoteService {

	@Autowired
	private ClientBuilder clientBuilder;

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

		System.err.println("Get all de la llamadaa");

		List<QuoteItem> list = new ArrayList<>();

		List<Quote> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl)
				.build().get().uri(this.allQuotes).retrieve().bodyToMono(Quote[].class).block());

		for (Quote quote : unmarshalledList) {

			System.out.println(quote.toString());
		}

		for (Quote quote : unmarshalledList) {

			list.add(new QuoteItem(quote.getQuote_id(), quote.getQuote(), quote.getAuthor(), quote.getAuthor()));
		}

		return list;

	}

	@Override
	public QuoteItem getRandom() {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
				.uri(this.randomQuote).retrieve().bodyToFlux(Quote.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);
	}

	@Override
	public QuoteItem findBy(int id) {

		Quote unmarshalledQuote = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
				.uri(this.quoteByid + id).retrieve().bodyToFlux(Quote.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledQuote, QuoteItem.class);

	}

}
