package com.imricki.breakingbad.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.imricki.breakingbad.domain.clientbuilder.ClientBuilder;
import com.imricki.breakingbad.domain.dto.Episode;
import com.imricki.breakingbad.domain.item.EpisodeItem;
import com.imricki.breakingbad.util.mapper.ObjectMapperUtils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@ConfigurationProperties
public class EpisodeClient implements EpisodeService {

	@Autowired
	private ClientBuilder clientBuilder;

	@Value(value = "${api.base.url}")
	private String baseUrl;

	@Value(value = "${api.all.episodes}")
	private String allEpisodes;

	@Override
	public List<EpisodeItem> getAll() {

		List<Episode> unmarshalledList = Arrays.asList(this.clientBuilder.getWebClientBuilder().baseUrl(this.baseUrl)
				.build().get().uri(this.allEpisodes).retrieve().bodyToMono(Episode[].class).block());

		return ObjectMapperUtils.mapAll(unmarshalledList, EpisodeItem.class);

	}
}
