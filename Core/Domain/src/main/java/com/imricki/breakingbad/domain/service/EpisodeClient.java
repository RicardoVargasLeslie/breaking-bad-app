package com.imricki.breakingbad.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;

@Service
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

}
