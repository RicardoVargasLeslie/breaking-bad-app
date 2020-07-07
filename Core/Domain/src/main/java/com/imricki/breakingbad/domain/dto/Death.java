package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Death implements Serializable {

	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("death_id")
	private int id;
	
	@JsonProperty("death")
	private String death;
	
	@JsonProperty("cause")
	private String cause;
	
	@JsonProperty("responsible")
	private String responsible;
	
	@JsonProperty("last_words")
	private String lastWords;
	
	@JsonProperty("season")
	private int season;
	
	@JsonProperty("episode")
	private int episode;
	
	@JsonProperty("number_of_deaths")
	private int numberOfdeaths;

}
