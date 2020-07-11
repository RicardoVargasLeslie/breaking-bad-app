package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.client.resorce.ClientResorces;
import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Episode;
import com.imricki.breakingbad.domain.item.EpisodeItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Override
	public List<EpisodeItem> getAll() {

		List<Episode> unmarshalledList = Arrays
				.asList(this.clientBuilder.getWebClientBuilder().baseUrl(ClientResorces.BASE_URL).build().get()
						.uri(ClientResorces.ALL_QUOTES).retrieve().bodyToMono(Episode[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, EpisodeItem.class);

	}
}
