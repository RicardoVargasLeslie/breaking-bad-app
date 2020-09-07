package com.imricki.breakingbad.util.mapper;

import org.modelmapper.PropertyMap;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.ui.model.QuoteModel;

public class QuoteMap extends PropertyMap<QuoteItem, QuoteModel> {

	@Override
	protected void configure() {

		this.map(this.source.getAuthor(), this.destination.getAuthor().get());
		this.map(this.source.getQuote(), this.destination.getQuote().get());
		this.map(this.source.getQuote_id(), this.destination.getQuote_id().get());
		this.map(this.source.getSeries(), this.destination.getSeries().get());

	}

}
