package com.imricki.breakingbad.ui.service;

import org.springframework.stereotype.Service;

import com.imricki.breakingbad.ui.dto.QuoteDto;
import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;

@Service
public class QuoteUI implements QuoteUIService {

//	@Autowired
//	private QuoteClient service;

	@Override
	public ListProperty<QuoteModel> getAll() {

//		ListProperty<QuoteModel> list = new SimpleListProperty<>(FXCollections.observableArrayList());
//
//		list.add(new QuoteModel(new QuoteDto(3, "dfffff", "fffff", "yyuu")));
//
//		return list;

		ListProperty<QuoteModel> list = new SimpleListProperty<>(FXCollections.observableArrayList());

		list.add(new QuoteModel(new QuoteDto(33, "hola", "rtr", "gif")));

//		return QuoteModel.tofxList(this.service.getAll());

		return list;
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
