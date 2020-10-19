package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.ui.model.DeathModel;

@Service
public class DeathUI implements DeathUIService {

	@Autowired
	private DeathClient service;

	@Override
	public List<DeathModel> getAll() {



		return null;
	}

	@Override
	public DeathModel getRandom() {

		return null;
	}

}
