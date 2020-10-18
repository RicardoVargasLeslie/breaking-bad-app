package com.imricki.breakingbad.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.DeathCount;
import com.imricki.breakingbad.domain.item.DeathItem;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ConfigurationProperties
public class DeathClient implements DeathService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.random.death}")
	private String randomDeath;
	@Value(value = "${api.all.deaths}")
	private String allDeaths;

	@Override
	public List<DeathItem> getAll() {

//		List<Death> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl)
//				.build().get().uri(this.allDeaths).retrieve().bodyToMono(Death[].class).block());

//		return ObjectMapperUtils.mapAll(unmarshalledList, DeathItem.class);
		return null;
	}

	@Override
	public DeathItem getRandom() {

//		Death unmarshalledDeath = this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl).build().get()
//				.uri(this.randomDeath).retrieve().bodyToFlux(Death.class).blockFirst();
//
//		return ObjectMapperUtils.map(unmarshalledDeath, DeathItem.class);
		return null;
	}

	@Override
	public DeathCount deathCount() {
		// TODO Auto-generated method stub
		return null;
	}

}
