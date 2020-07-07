package com.imricki.breakingbad.domain.service;

import java.util.List;

import com.imricki.breakingbad.domain.dto.Quote;

public interface QuoteService {

	List<Quote> getAllQuotes();

	Quote getRandomQuote();
}
