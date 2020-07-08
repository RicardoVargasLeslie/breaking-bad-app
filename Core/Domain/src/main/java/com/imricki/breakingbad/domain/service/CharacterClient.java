package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Character;

@Service
public class CharacterClient implements CharacterService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public Character getRandomCharacter() {

		return this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.RANDOM_CHARACTER).retrieve().bodyToFlux(Character.class).blockFirst();
	}

	@Override
	public List<Character> getAllCharacters() {

		Character[] deaths = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_CHARACTERS).retrieve().bodyToMono(Character[].class).block();

		System.err.println(deaths[1]);
		return Arrays.asList(deaths);
	}
}
