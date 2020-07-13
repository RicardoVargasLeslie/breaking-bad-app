package com.imricki.breakingbad.ui.model;

import java.util.ArrayList;

import javafx.beans.property.StringProperty;
import lombok.Data;

@Data
public class EpisodeModel {

	private IntegerProperty id;

	private StringProperty title;

	private IntegerProperty season;

	private IntegerProperty episode;

	private StringProperty air_date;

	private ArrayList<String> characters;

	private StringProperty series;

	

}
