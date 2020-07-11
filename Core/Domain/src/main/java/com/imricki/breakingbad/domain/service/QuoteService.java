package com.imricki.breakingbad.domain.service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.comon.BaseService;
import com.imricki.breakingbad.domain.service.comon.FindService;
import com.imricki.breakingbad.domain.service.comon.RandomService;

public interface QuoteService extends BaseService<QuoteItem>, RandomService<QuoteItem>, FindService<QuoteItem> {

}
