package com.imricki.breakingbad.domain.dto;

import java.io.Serializable;
import lombok.Data;


@Data
public class Quote implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int id;

	private String quote;

	private String author;

	private String series;
}
