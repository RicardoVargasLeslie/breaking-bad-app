package com.imricki.breakingbad.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuoteDto {

	private Integer quote_id;

	private String quote;

	private String author;

	private String series;

}
