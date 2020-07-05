package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Episode implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String title;

	private int season;

	private int episode;

	private String air_date;

	private List<String> characters;

	private String series;
}
