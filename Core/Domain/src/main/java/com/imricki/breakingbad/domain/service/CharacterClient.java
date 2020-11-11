package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.item.CharacterItem;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ConfigurationProperties
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.random.character}")
	private String randomCharacter;
	@Value(value = "${api.all.characters}")
	private String allCharacters;
	@Value(value = "${api.character.by.id}")
	private String characterByid;

	@Override
	public List<CharacterItem> getAll() {

		return null;
	}

	@Override
	public CharacterItem getRandom() {

		return null;
	}

}
