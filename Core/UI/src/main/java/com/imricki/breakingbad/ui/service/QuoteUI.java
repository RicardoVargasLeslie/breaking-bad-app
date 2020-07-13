package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.imricki.breakingbad.domain.service.QuoteClient;

public class QuoteUI implements QuoteUIService {

	@Autowired
	private QuoteClient quote;

	@Override
	public List<QuoteUI> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
