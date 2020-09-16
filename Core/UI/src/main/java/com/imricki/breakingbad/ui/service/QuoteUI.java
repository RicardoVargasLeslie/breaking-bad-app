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

//		QuoteItemList.forEach(System.out::println);
//
//		List<QuoteModel> QuotemodelLis = ObjectMapperUtils.mapAll(QuoteItemList, QuoteModel.class);
//
//		QuotemodelLis.forEach(System.out::println);
		return dddd;
	}

	@Override
	public QuoteModel getRandom() {

		QuoteModel model = new QuoteModel();
		return model.toFxBean(this.service.getRandom());

	}

	@Override
	public QuoteModel findBy(int id) {

		QuoteModel model = new QuoteModel();
		return model.toFxBean(this.service.findBy(id));
	}

}
