package com.imricki.breakingbad.ui.service;

import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;

public interface QuoteUIService {

	ListProperty<QuoteModel> getAll();

}
