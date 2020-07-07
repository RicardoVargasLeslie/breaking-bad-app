package com.imricki.breakingbad.domain.service;

import java.util.List;

import com.imricki.breakingbad.domain.dto.Character;

public interface CharacterService {

	Character getRandomCharacter();

	List<Character> getAllCharacters();

}
