package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Character;
import com.imricki.breakingbad.domain.item.CharacterItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<CharacterItem> getAll() {

		List<Character> unmarshalledList = Arrays
				.asList(this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
						.uri(ClientResorces.ALL_CHARACTERS).retrieve().bodyToMono(Character[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, CharacterItem.class);
	}

	@Override
	public CharacterItem getRandom() {

		Character unmarshalledCharacter = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL)
				.build().get().uri(ClientResorces.RANDOM_CHARACTER).retrieve().bodyToFlux(Character.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledCharacter, CharacterItem.class);
	}

}
