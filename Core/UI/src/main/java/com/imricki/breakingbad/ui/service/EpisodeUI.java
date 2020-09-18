package com.imricki.breakingbad.ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.service.EpisodeClient;
import com.imricki.breakingbad.ui.model.EpisodeModel;

@Service
public class EpisodeUI implements EpisodeUIService {

	@Autowired
	private EpisodeClient service;

	@Override
	public List<EpisodeModel> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
