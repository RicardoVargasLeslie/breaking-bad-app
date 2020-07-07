package com.imricki.breakingbad.ui.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Death {

	private int id;
	
	private String death;
	
	private String cause;
	
	private String responsible;
	
	private String lastWords;
	
	private int season;
	
	private int episode;
	
	private int numberOfdeaths;

}
