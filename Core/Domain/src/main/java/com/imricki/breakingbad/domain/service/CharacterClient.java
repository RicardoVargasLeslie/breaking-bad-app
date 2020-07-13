package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Character;
import com.imricki.breakingbad.domain.item.CharacterItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.base.url}")
	private String BASE_URL;
	@Value(value = "${api.random.character}")
	private String RANDOM_CHARACTER;
	@Value(value = "${api.all.characters}")
	private String ALL_CHARACTERS;
	@Value(value = "${api.character.by.id}")
	private String CHARACTER_BY_ID;

	@Override
	public List<CharacterItem> getAll() {

		List<Character> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL)
				.build().get().uri(this.ALL_CHARACTERS).retrieve().bodyToMono(Character[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, CharacterItem.class);
	}

	@Override
	public CharacterItem getRandom() {

		Character unmarshalledCharacter = this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL).build().get()
				.uri(this.RANDOM_CHARACTER).retrieve().bodyToFlux(Character.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledCharacter, CharacterItem.class);
	}

}
