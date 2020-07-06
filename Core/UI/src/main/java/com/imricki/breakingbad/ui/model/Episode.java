package com.imricki.breakingbad.ui.model;

import java.util.ArrayList;

public class Episode {

	private int id;

	private String title;

	private int season;

	private int episode;

	private String air_date;

	private ArrayList<String> characters;

	private String series;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSeason() {
		return this.season;
	}

	public void setSeason(int season) {
		this.season = season;
	}

	public int getEpisode() {
		return this.episode;
	}

	public void setEpisode(int episode) {
		this.episode = episode;
	}

	public String getAir_date() {
		return this.air_date;
	}

	public void setAir_date(String air_date) {
		this.air_date = air_date;
	}

	public ArrayList<String> getCharacters() {
		return this.characters;
	}

	public void setCharacters(ArrayList<String> characters) {
		this.characters = characters;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

}
