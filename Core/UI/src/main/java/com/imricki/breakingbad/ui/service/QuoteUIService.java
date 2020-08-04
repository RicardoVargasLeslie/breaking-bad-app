package com.imricki.breakingbad.ui.service;

import com.imricki.breakingbad.domain.service.shared.BaseService;
import com.imricki.breakingbad.domain.service.shared.FindService;
import com.imricki.breakingbad.domain.service.shared.RandomService;
import com.imricki.breakingbad.ui.model.QuoteModel;

public interface QuoteUIService extends BaseService<QuoteModel>, RandomService<QuoteModel>, FindService<QuoteModel> {

}
