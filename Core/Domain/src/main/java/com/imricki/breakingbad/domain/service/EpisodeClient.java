package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Episode;

@Service
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Episode> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
