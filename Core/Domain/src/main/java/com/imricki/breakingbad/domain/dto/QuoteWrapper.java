package com.imricki.breakingbad.domain.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteWrapper {

	@JsonIgnore
	private ArrayList<Quote> quotes = new ArrayList<>();

	public QuoteWrapper() {
		this.quotes = new ArrayList<>();
	}

	public List<Quote> getQuotes() {
		return this.quotes;
	}

	public void setQuotes(ArrayList<Quote> quotes) {
		this.quotes = quotes;
	}

	@Override
	public String toString() {
		return "QuoteWrapper [quotes=" + this.quotes + "]";
	}

}
