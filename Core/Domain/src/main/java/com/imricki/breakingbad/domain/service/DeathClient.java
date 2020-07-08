package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Death;

@Service
public class DeathClient implements DeathService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Death> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Death getRandom() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deathCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
