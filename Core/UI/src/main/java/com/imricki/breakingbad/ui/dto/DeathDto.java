package com.imricki.breakingbad.ui.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Component
@Data
@AllArgsConstructor
public class DeathDto {

	private int id;
	private String death;
	private String cause;
	private String responsible;
	private String lastWords;
	private String season;
	private Integer episode;
	private Integer numberOfdeaths;

}
