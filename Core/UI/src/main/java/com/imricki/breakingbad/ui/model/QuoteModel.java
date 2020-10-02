package com.imricki.breakingbad.ui.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.ui.dto.QuoteDto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

@Component
public class QuoteModel {

	private IntegerProperty quote_id;

	private StringProperty quote;

	private StringProperty author;

	private StringProperty series;

	@Autowired
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

	public static ListProperty<QuoteModel> tofxList(List<QuoteItem> itemList) {

		ListProperty<QuoteModel> modelList = new SimpleListProperty<>(FXCollections.observableArrayList());

		itemList.stream().forEach(item -> {

			QuoteModel model = new QuoteModel(
					new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries()));

			modelList.add(model);

		});

		return modelList;
	}

}
