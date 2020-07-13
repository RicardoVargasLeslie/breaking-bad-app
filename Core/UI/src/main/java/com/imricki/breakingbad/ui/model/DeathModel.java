package com.imricki.breakingbad.ui.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeathModel {

	private IntegerProperty id;
	
	private String death;
	
	private String cause;
	
	private String responsible;
	
	private String lastWords;
	
	private IntegerProperty season;
	
	private IntegerProperty episode;
	
	private IntegerProperty numberOfdeaths;

}
