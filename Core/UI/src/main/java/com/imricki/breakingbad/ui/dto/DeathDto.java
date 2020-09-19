package com.imricki.breakingbad.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeathDto {

	private Integer id;
	private String death;
	private String cause;
	private String responsible;
	private String lastWords;
	private String season;
	private Integer episode;
	private Integer numberOfdeaths;

}
