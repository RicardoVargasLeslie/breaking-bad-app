package com.imricki.breakingbad.ui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.domain.service.DeathService;

@Service
public class DeathServiceUI implements DeathService {

	@Autowired
	private DeathClient service;

}
