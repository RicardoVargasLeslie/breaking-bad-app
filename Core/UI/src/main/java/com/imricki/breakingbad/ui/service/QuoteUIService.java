package com.imricki.breakingbad.ui.service;

import org.springframework.stereotype.Service;

import com.imricki.breakingbad.ui.model.QuoteModel;

import javafx.beans.property.ListProperty;

@Service
interface QuoteUIService {

	ListProperty<QuoteModel> getAll();

}
