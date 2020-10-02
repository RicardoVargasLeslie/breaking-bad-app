package com.imricki.breakingbad.ui.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class QuoteDto {

	private Integer quote_id;

	private String quote;

	private String author;

	private String series;

	public QuoteDto() {

	}
}
