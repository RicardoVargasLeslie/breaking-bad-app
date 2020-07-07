package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Death;

@Service
public class DeathClient implements DeathService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<Death> getAllDeaths() {

		Death[] deaths = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
				.uri(ClientResorces.ALL_DEATHS).retrieve().bodyToMono(Death[].class).block();

		return Arrays.asList(deaths);
	}

}
