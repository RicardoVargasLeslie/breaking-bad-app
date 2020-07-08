package com.imricki.breakingbad.domain.service;

import com.imricki.breakingbad.domain.service.shared.BaseService;
import com.imricki.breakingbad.domain.service.shared.RandomService;

public interface DeathService extends BaseService, RandomService {

	int deathCount();
}
