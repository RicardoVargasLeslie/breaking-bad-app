package com.imricki.breakingbad.ui.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class QuoteModel {

	private StringProperty quote_id = new SimpleStringProperty(this, "quote_id");

	private StringProperty quote = new SimpleStringProperty(this, "quote");

	private StringProperty author = new SimpleStringProperty(this, "author");

	private StringProperty series = new SimpleStringProperty(this, "series");

	public StringProperty getQuote_id() {
		return this.quote_id;
	}

	public void setQuote_id(StringProperty quote_id) {
		this.quote_id = quote_id;
	}

	public StringProperty getQuote() {
		return this.quote;
	}

	public void setQuote(StringProperty quote) {
		this.quote = quote;
	}

	public StringProperty getAuthor() {
		return this.author;
	}

	public void setAuthor(StringProperty author) {
		this.author = author;
	}

	public StringProperty getSeries() {
		return this.series;
	}

	public void setSeries(StringProperty series) {
		this.series = series;
	}

	@Override
	public String toString() {
		return "QuoteModel [quote_id=" + this.quote_id + ", quote=" + this.quote + ", author=" + this.author
				+ ", series=" + this.series + "]";
	}

}
