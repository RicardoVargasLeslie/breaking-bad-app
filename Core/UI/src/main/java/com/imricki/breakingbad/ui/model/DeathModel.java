package com.imricki.breakingbad.ui.model;

import com.imricki.breakingbad.ui.dto.DeathDto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DeathModel {

	private IntegerProperty id;

	private StringProperty death;

	private StringProperty cause;

	private StringProperty responsible;

	private StringProperty lastWords;

	private StringProperty season;

	private IntegerProperty episode;

	private IntegerProperty numberOfdeaths;

	public DeathModel() {

	}

	public DeathModel(DeathDto dto) {

		this.id = new SimpleIntegerProperty(dto.getId());
		this.death = new SimpleStringProperty(dto.getDeath());
		this.cause = new SimpleStringProperty(dto.getCause());
		this.responsible = new SimpleStringProperty(dto.getResponsible());
		this.lastWords = new SimpleStringProperty(dto.getLastWords());
		this.season = new SimpleStringProperty(dto.getSeason());
		this.episode = new SimpleIntegerProperty(dto.getEpisode());
		this.numberOfdeaths = new SimpleIntegerProperty(dto.getNumberOfdeaths());
	}

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

//	public static DeathModel toFxBean(DeathItem item) {
//
//		DeathModel modelfx = new DeathModel();
//
//		if (item == null) {
//
//			throw new NullPointerException("Null Item");
//		}
//
//		modelfx.setCause(new SimpleStringProperty(item.getCause()));
//		modelfx.setDeath(new SimpleStringProperty(item.getDeath()));
//		modelfx.setEpisode(new SimpleIntegerProperty(item.getEpisode()));
//		modelfx.setId(new SimpleIntegerProperty(item.getId()));
//		modelfx.setLastWords(new SimpleStringProperty(item.getLastWords()));
//		modelfx.setNumberOfdeaths(new SimpleIntegerProperty(item.getNumberOfdeaths()));
//		modelfx.setResponsible(new SimpleStringProperty(item.getResponsible()));
//		modelfx.setSeason(new SimpleStringProperty(String.valueOf(item.getSeason())));
//
//		return modelfx;
//	}

//	public List<DeathModel> tofxList(List<DeathItem> itemList) {
//
//		List<DeathModel> modelList = new ArrayList<>();
//
//		for (DeathItem item : itemList) {
//
//			DeathModel m = new DeathModel(item.getId(), item.getDeath(), item.getCause(), item.getResponsible(),
//					item.getLastWords(), String.valueOf(item.getSeason()), item.getEpisode(), item.getNumberOfdeaths());
//
//			modelList.add(m);
//		}
//
//		return modelList;
//	}

	@Override
	public String toString() {
		return "DeathModel [id=" + this.id + ", death=" + this.death + ", cause=" + this.cause + ", responsible="
				+ this.responsible + ", lastWords=" + this.lastWords + ", season=" + this.season + ", episode="
				+ this.episode + ", numberOfdeaths=" + this.numberOfdeaths + "]";
	}

}
