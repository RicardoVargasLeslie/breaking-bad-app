package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Character;

@Service
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Character> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character getRandom() {
		// TODO Auto-generated method stub
		return null;
	}

}
