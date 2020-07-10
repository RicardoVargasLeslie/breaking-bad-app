package com.imricki.breakingbad.domain.item;

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
public class QuoteItem implements Serializable {
	
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private static final long serialVersionUID = 1L;

	@JsonProperty("quote_id")
	private int quote_id;

	@JsonProperty("quote")
	private String quote;

	@JsonProperty("author")
	private String author;

	@JsonProperty("series")
	private String series;
	
}
