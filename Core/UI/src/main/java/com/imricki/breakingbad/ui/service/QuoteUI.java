package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.dto.QuoteDto;
import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

@Service
public class QuoteUI implements QuoteUIService {

	@Autowired
	@Lazy
	private QuoteClient service = new QuoteClient();

	@Override
	public ListProperty<QuoteModel> getAll() {

		List<QuoteItem> items = this.service.getAll();

		ListProperty<QuoteModel> properties = new SimpleListProperty<>(FXCollections.observableArrayList());

		for (QuoteItem item : items) {

			properties.add(new QuoteModel(
					new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries())));
		}
		return properties;

	}

//	@Override
//	public QuoteModel getRandom() {
//
//		QuoteItem item = this.service.getRandom();
//		return new QuoteModel(new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries()));
//
//	}
//
//	@Override
//	public QuoteModel findBy(int id) {
//
//		QuoteItem item = this.service.findBy(id);
//		return new QuoteModel(new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries()));
//	}

}
