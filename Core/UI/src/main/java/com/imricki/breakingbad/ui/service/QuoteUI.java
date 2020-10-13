package com.imricki.breakingbad.ui.service;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

@Service
public class QuoteUI implements QuoteUIService {

	private static final Logger LOGGER = Logger.getLogger(QuoteUI.class.getName());

//	@Autowired
//	private QuoteClient service;

	@Override
	public ListProperty<QuoteModel> getAll() {

		LOGGER.info("Called GetAll from------------>QuoteUI");

		ListProperty<QuoteModel> properties = new SimpleListProperty<>(FXCollections.observableArrayList());
//		List<QuoteItem> items = this.service.getAll();
//
//		ListProperty<QuoteModel> properties = new SimpleListProperty<>(FXCollections.observableArrayList());
//
//		for (QuoteItem item : items) {
//
//			properties.add(new QuoteModel(
//					new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries())));
//		}
		return properties;

	}

}
