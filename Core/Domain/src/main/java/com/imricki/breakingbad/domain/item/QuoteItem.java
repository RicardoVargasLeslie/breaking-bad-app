package com.imricki.breakingbad.domain.item;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class QuoteItem {

	private int quote_id;

	private String quote;

	private String author;

	private String series;

}
