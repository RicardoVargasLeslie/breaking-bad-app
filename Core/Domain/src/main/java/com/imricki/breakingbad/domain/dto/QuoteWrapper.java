package com.imricki.breakingbad.domain.dto;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteWrapper {

	private ArrayList<Quote> quotes = new ArrayList<>();

	public QuoteWrapper() {
		this.quotes = new ArrayList<>();
	}

	public ArrayList<Quote> getQuotes() {
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
