package com.imricki.breakingbad.ui.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.imricki.breakingbad.domain.service.QuoteClient;

public class QuoteUI implements QuoteUIService {

	@Autowired
	private QuoteClient quote;

}
