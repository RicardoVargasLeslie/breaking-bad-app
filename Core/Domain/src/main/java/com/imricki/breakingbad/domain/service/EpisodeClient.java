package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;

@Service
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Object> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getBy(Object criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
