package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.util.mapper.ObjectMapperUtils;

@Service
public class QuoteUI implements QuoteUIService {

	@Autowired
	private QuoteClient service;

	@Override
	public List<QuoteModel> getAll() {

		List<QuoteItem> QuoteItemList = this.service.getAll();

		return ObjectMapperUtils.mapAll(QuoteItemList, QuoteModel.class);
	}

	@Override
	public QuoteModel getRandom() {

		return null;
	}

	@Override
	public QuoteModel findBy(int id) {

		return null;
	}

}
