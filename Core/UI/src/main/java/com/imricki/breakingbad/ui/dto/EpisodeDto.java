package com.imricki.breakingbad.ui.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EpisodeDto {

	private Integer id;

	private String title;

	private Integer season;

	private Integer episode;

	private String air_date;

	private List<String> characters;

	private String series;
}
