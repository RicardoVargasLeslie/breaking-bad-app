package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Death;
import com.imricki.breakingbad.domain.dto.DeathCount;
import com.imricki.breakingbad.domain.item.DeathItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
public class DeathClient implements DeathService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<DeathItem> getAll() {

		List<Death> unmarshalledList = Arrays
				.asList(this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
						.uri(ClientResorces.ALL_DEATHS).retrieve().bodyToMono(Death[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, DeathItem.class);
	}

	@Override
	public DeathItem getRandom() {

		Death unmarshalledDeath = this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build()
				.get().uri(ClientResorces.RANDOM_DEATHS).retrieve().bodyToFlux(Death.class).blockFirst();

		return ObjectMapperUtils.map(unmarshalledDeath, DeathItem.class);
	}

	@Override
	public DeathCount deathCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
