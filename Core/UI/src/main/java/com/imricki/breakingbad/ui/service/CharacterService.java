package com.imricki.breakingbad.ui.service;

import com.imricki.breakingbad.domain.service.comon.BaseService;
import com.imricki.breakingbad.domain.service.comon.RandomService;
import com.imricki.breakingbad.ui.model.CharacterModel;

public interface CharacterService extends BaseService<CharacterModel>, RandomService<CharacterModel> {

}
