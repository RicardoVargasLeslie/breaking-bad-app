package com.imricki.breakingbad.domain.service;

import com.imricki.breakingbad.domain.dto.Character;
import com.imricki.breakingbad.domain.service.shared.BaseService;
import com.imricki.breakingbad.domain.service.shared.RandomService;

public interface CharacterService extends BaseService<Character>, RandomService<Character> {

}
