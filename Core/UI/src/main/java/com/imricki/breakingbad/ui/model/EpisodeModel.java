package com.imricki.breakingbad.ui.model;

import java.util.ArrayList;
import java.util.List;

import com.imricki.breakingbad.domain.item.EpisodeItem;
import com.imricki.breakingbad.ui.dto.EpisodeDto;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class EpisodeModel {

	private IntegerProperty id;

	private StringProperty title;

	private IntegerProperty season;

	private IntegerProperty episode;

	private StringProperty air_date;

	private ListProperty<String> characters;

	private StringProperty series;

	public EpisodeModel(EpisodeDto dto) {

		this.id = new SimpleIntegerProperty(this, "id", dto.getId());
		this.title = new SimpleStringProperty(this, "title", dto.getTitle());
		this.season = new SimpleIntegerProperty(this, "season", dto.getSeason());
		this.episode = new SimpleIntegerProperty(this, "episode", dto.getEpisode());
		this.air_date = new SimpleStringProperty(this, "air_date", dto.getAir_date());
		this.characters = new SimpleListProperty<>(this, "characters",
				FXCollections.observableArrayList(dto.getCharacters()));
		this.series = new SimpleStringProperty(this, "series", dto.getSeries());
	}

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

	public static List<EpisodeModel> tofxList(List<EpisodeItem> itemList) {

		List<EpisodeModel> modelList = new ArrayList<>();

		for (EpisodeItem item : itemList) {

			EpisodeModel model = new EpisodeModel(new EpisodeDto(item.getId(), item.getTitle(), item.getSeason(),
					item.getEpisode(), item.getAir_date(), item.getCharacters(), item.getSeries()));

			modelList.add(model);
		}

		return modelList;
	}

}
