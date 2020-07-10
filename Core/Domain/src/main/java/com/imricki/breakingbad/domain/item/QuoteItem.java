package com.imricki.breakingbad.domain.item;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class QuoteItem   {
	
	private int quote_id;

	private String quote;

	private String author;

	private String series;

}
