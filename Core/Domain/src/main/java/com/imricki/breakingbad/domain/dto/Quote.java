package com.imricki.breakingbad.domain.dto;

public class Quote {

	public Quote() {

	}

	private int quote_id;

	private String quote;

	private String author;

	private String series;

	public int getQuote_id() {
		return this.quote_id;
	}

	public void setQuote_id(int quote_id) {
		this.quote_id = quote_id;
	}

	public String getQuote() {
		return this.quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

}
