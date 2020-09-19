package com.imricki.breakingbad.ui.model;

import com.imricki.breakingbad.ui.dto.QuoteDto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class QuoteModel {

	private IntegerProperty quote_id;

	private StringProperty quote;

	private StringProperty author;

	private StringProperty series;

	public QuoteModel(QuoteDto dto) {

		this.quote_id = new SimpleIntegerProperty(dto.getQuote_id());
		this.quote = new SimpleStringProperty(dto.getQuote());
		this.author = new SimpleStringProperty(dto.getAuthor());
		this.series = new SimpleStringProperty(dto.getSeries());

	}

	public IntegerProperty getQuote_id() {
		return this.quote_id;
	}

	public void setQuote_id(IntegerProperty quote_id) {
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
		return "QuoteModel [quote_id=" + this.getQuote_id().get() + ", quote=" + this.getQuote().get() + ", author="
				+ this.getAuthor().get() + ", series=" + this.getSeries().get() + "]";
	}

//	public static QuoteModel toFxBean(QuoteItem item) {
//
//		QuoteModel modelfx = new QuoteModel();
//
//		if (item == null) {
//
//			throw new NullPointerException("Null Item");
//		}
//
//		modelfx.setAuthor(new SimpleStringProperty(item.getAuthor()));
//		modelfx.setQuote(new SimpleStringProperty(item.getQuote()));
//		modelfx.setQuote_id(new SimpleStringProperty(String.valueOf(item.getQuote_id())));
//		modelfx.setSeries(new SimpleStringProperty(item.getSeries()));
//		return modelfx;
//	}
}
