package com.imricki.breakingbad.domain.item;

import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class EpisodeItem   {
	
	private int id;
	
	private String title;
	
	private int season;
	
	private int episode;
	
	private String air_date;
	
	private List<String> characters;

	private String series;

}
