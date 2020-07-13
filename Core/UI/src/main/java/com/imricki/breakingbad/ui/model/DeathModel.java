package com.imricki.breakingbad.ui.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeathModel {

	private IntegerProperty id = new SimpleIntegerProperty(this, "id");

	private StringProperty death = new SimpleStringProperty(this, "death");

	private StringProperty cause = new SimpleStringProperty(this, "cause");

	private StringProperty responsible = new SimpleStringProperty(this, "responsible");

	private StringProperty lastWords = new SimpleStringProperty(this, "lastWords");

	private StringProperty season = new SimpleStringProperty(this, "season");

	private IntegerProperty episode = new SimpleIntegerProperty(this, "episode");

	private IntegerProperty numberOfdeaths = new SimpleIntegerProperty(this, "numberOfdeaths");

	public IntegerProperty getId() {
		return this.id;
	}

	public void setId(IntegerProperty id) {
		this.id = id;
	}

	public StringProperty getDeath() {
		return this.death;
	}

	public void setDeath(StringProperty death) {
		this.death = death;
	}

	public StringProperty getCause() {
		return this.cause;
	}

	public void setCause(StringProperty cause) {
		this.cause = cause;
	}

	public StringProperty getResponsible() {
		return this.responsible;
	}

	public void setResponsible(StringProperty responsible) {
		this.responsible = responsible;
	}

	public StringProperty getLastWords() {
		return this.lastWords;
	}

	public void setLastWords(StringProperty lastWords) {
		this.lastWords = lastWords;
	}

	public StringProperty getSeason() {
		return this.season;
	}

	public void setSeason(StringProperty season) {
		this.season = season;
	}

	public IntegerProperty getEpisode() {
		return this.episode;
	}

	public void setEpisode(IntegerProperty episode) {
		this.episode = episode;
	}

	public IntegerProperty getNumberOfdeaths() {
		return this.numberOfdeaths;
	}

	public void setNumberOfdeaths(IntegerProperty numberOfdeaths) {
		this.numberOfdeaths = numberOfdeaths;
	}

}
