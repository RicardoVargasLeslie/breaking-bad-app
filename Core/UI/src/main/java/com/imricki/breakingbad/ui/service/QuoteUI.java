package com.imricki.breakingbad.ui.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;
import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.dto.QuoteDto;
import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

@Service
public class QuoteUI implements QuoteUIService {

	private static final Logger LOGGER = Logger.getLogger(QuoteUI.class.getName());


	private QuoteClient client = new QuoteClient();

	@Override
	public ListProperty<QuoteModel> getAll() {

		ListProperty<QuoteModel> models = new SimpleListProperty<>(FXCollections.observableArrayList());
		List<QuoteItem> items = this.client.getAll();
		items.forEach(item ->
		models.add(new QuoteModel(new QuoteDto(
				item.getQuote_id(),
				item.getQuote(),
				item.getAuthor(),
				item.getSeries())))
				);
		return models;
	}

	@Override
	public QuoteModel getRandom() {

		return ObjectMapperUtils.map(this.client.getRandom(), QuoteModel.class);
	}

	@Override
	public QuoteModel findBy(int id) {

		return ObjectMapperUtils.map(this.client.findBy(id), QuoteModel.class);
	}
}



