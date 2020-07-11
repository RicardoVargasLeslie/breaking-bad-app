package com.imricki.breakingbad.domain.service;

import com.imricki.breakingbad.domain.dto.DeathCount;
import com.imricki.breakingbad.domain.item.DeathItem;
import com.imricki.breakingbad.domain.service.comon.BaseService;
import com.imricki.breakingbad.domain.service.comon.RandomService;

public interface DeathService extends BaseService<DeathItem>, RandomService<DeathItem> {

	DeathCount deathCount();
}
