package com.imricki.breakingbad.domain.service;

import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.shared.BaseService;
import com.imricki.breakingbad.domain.service.shared.FindService;
import com.imricki.breakingbad.domain.service.shared.RandomService;

public interface QuoteService extends BaseService<QuoteItem>, RandomService<QuoteItem>, FindService<QuoteItem> {

}
