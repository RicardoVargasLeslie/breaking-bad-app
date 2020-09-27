package com.imricki.breakingbad.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;

@Service
public class QuoteUI implements QuoteUIService {

	@Autowired
	private QuoteClient service;

	@Override
	public ListProperty<QuoteModel> getAll() {

		return QuoteModel.tofxList(this.service.getAll());
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
