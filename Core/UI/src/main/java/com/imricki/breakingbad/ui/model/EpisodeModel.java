package com.imricki.breakingbad.ui.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class EpisodeModel {

	private IntegerProperty id = new SimpleIntegerProperty(this, "id");

	private StringProperty title = new SimpleStringProperty(this, "title");

	private IntegerProperty season = new SimpleIntegerProperty(this, "season");

	private IntegerProperty episode = new SimpleIntegerProperty(this, "episode");

	private StringProperty air_date = new SimpleStringProperty(this, "air_date");

	private ListProperty<String> characters = new SimpleListProperty<>(this, "characters",
			FXCollections.observableArrayList());

	private StringProperty series = new SimpleStringProperty(this, "series");

	public IntegerProperty getId() {
		return this.id;
	}

	public void setId(IntegerProperty id) {
		this.id = id;
	}

	public StringProperty getTitle() {
		return this.title;
	}

	public void setTitle(StringProperty title) {
		this.title = title;
	}

	public IntegerProperty getSeason() {
		return this.season;
	}

	public void setSeason(IntegerProperty season) {
		this.season = season;
	}

	public IntegerProperty getEpisode() {
		return this.episode;
	}

	public void setEpisode(IntegerProperty episode) {
		this.episode = episode;
	}

	public StringProperty getAir_date() {
		return this.air_date;
	}

	public void setAir_date(StringProperty air_date) {
		this.air_date = air_date;
	}

	public ListProperty<String> getCharacters() {
		return this.characters;
	}

	public void setCharacters(ListProperty<String> characters) {
		this.characters = characters;
	}

	public StringProperty getSeries() {
		return this.series;
	}

	public void setSeries(StringProperty series) {
		this.series = series;
	}

}
