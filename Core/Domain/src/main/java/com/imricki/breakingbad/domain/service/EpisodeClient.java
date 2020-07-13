package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Episode;
import com.imricki.breakingbad.domain.item.EpisodeItem;
import com.imricki.breakingbad.domain.mapper.ObjectMapperUtils;

@Service
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.base.url}")
	private String BASE_URL;

	@Value(value = "${api.all.episodes}")
	private String ALL_EPISODES;

	@Override
	public List<EpisodeItem> getAll() {

		List<Episode> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.BASE_URL)
				.build().get().uri(this.ALL_EPISODES).retrieve().bodyToMono(Episode[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, EpisodeItem.class);

	}
}
