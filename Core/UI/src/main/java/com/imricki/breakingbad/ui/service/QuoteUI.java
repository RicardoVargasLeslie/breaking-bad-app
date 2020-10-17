package com.imricki.breakingbad.ui.service;

import java.util.List;
import java.util.logging.Logger;

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
@Lazy
public class QuoteUI implements QuoteUIService {

	private static final Logger LOGGER = Logger.getLogger(QuoteUI.class.getName());

	@Autowired
	private QuoteClient service;

	@Override
	public ListProperty<QuoteModel> getAll() {

		LOGGER.info("Called GetAll from------------>QuoteUI");

		ListProperty<QuoteModel> properties = new SimpleListProperty<>(FXCollections.observableArrayList());
		List<QuoteItem> items = this.service.getAll();

		for (QuoteItem item : items) {

			properties.add(new QuoteModel(
					new QuoteDto(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries())));
		}
		return properties;

	}

}
