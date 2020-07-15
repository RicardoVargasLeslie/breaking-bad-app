package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Character;
import com.imricki.breakingbad.domain.item.CharacterItem;
import com.imricki.breakingbad.util.mapper.ObjectMapperUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ConfigurationProperties
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.base.url}")
	private String baseUrl;
	@Value(value = "${api.random.character}")
	private String randomCharacter;
	@Value(value = "${api.all.characters}")
	private String allCharacters;
	@Value(value = "${api.character.by.id}")
	private String characterByid;

	@Override
	public List<CharacterItem> getAll() {

		List<Character> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl)
				.build().get().uri(this.allCharacters).retrieve().bodyToMono(Character[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, CharacterItem.class);
	}

	@Override
	public CharacterItem getRandom() {

		Character unmarshalledCharacter = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
				.uri(this.randomCharacter).retrieve().bodyToFlux(Character.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledCharacter, CharacterItem.class);
	}

}
