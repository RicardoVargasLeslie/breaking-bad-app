package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.model.QuoteModel;

@Service
public class QuoteUI implements QuoteUIService {

	@Autowired
	private QuoteClient service;

	@Override
	public List<QuoteModel> getAll() {

		List<QuoteItem> QuoteItemList = this.service.getAll();

		List<QuoteModel> dddd = null;

		return dddd;
	}

	@Override
	public QuoteModel getRandom() {

		QuoteItem item = this.service.getRandom();
		return new QuoteModel(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries());

	}

	@Override
	public QuoteModel findBy(int id) {

		QuoteItem item = this.service.findBy(id);
		return new QuoteModel(item.getQuote_id(), item.getQuote(), item.getAuthor(), item.getSeries());
	}

}
