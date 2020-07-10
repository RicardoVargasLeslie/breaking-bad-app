package com.imricki.breakingbad.domain.item;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeathItem   {

	private int id;
	
	private String death;
	
	private String cause;
	
	private String responsible;
	
	private String lastWords;
	
	private int season;
	
	private int episode;
	
	private int numberOfdeaths;

}
