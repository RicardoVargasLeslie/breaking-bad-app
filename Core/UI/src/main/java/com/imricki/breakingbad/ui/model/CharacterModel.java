package com.imricki.breakingbad.ui.model;

import java.util.List;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;

public class CharacterModel {

	private IntegerProperty id;

	private StringProperty name;

	private StringProperty birthday;

	private ListProperty<String> occupation;

	private StringProperty img;

	private StringProperty status;

	private StringProperty nickname;

	private ListProperty<String> appearance;

	private StringProperty portrayed;

	private ListProperty<String> category;

	public CharacterModel(Integer id, String name, String birthday, List<String> occupation, String img, String status,
			String nickname, List<String> appearance, String portrayed, List<String> category) {

		this.id = new SimpleIntegerProperty(id);
		this.name = new SimpleStringProperty(name);
		this.birthday = new SimpleStringProperty(birthday);
		this.occupation = new SimpleListProperty<>(this, "occupation", FXCollections.observableArrayList());
		this.img = new SimpleStringProperty(img);
		this.status = new SimpleStringProperty(status);
		this.nickname = new SimpleStringProperty(nickname);
		this.appearance = new SimpleListProperty<>(this, "appearance", FXCollections.observableArrayList());
		this.portrayed = new SimpleStringProperty(portrayed);
		this.category = new SimpleListProperty<>(this, "category", FXCollections.observableArrayList());
	}

	public IntegerProperty getId() {
		return this.id;
	}

	public void setId(IntegerProperty id) {
		this.id = id;
	}

	public StringProperty getName() {
		return this.name;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}

	public StringProperty getBirthday() {
		return this.birthday;
	}

	public void setBirthday(StringProperty birthday) {
		this.birthday = birthday;
	}

	public ListProperty<String> getOccupation() {
		return this.occupation;
	}

	public void setOccupation(ListProperty<String> occupation) {
		this.occupation = occupation;
	}

	public StringProperty getImg() {
		return this.img;
	}

	public void setImg(StringProperty img) {
		this.img = img;
	}

	public StringProperty getStatus() {
		return this.status;
	}

	public void setStatus(StringProperty status) {
		this.status = status;
	}

	public StringProperty getNickname() {
		return this.nickname;
	}

	public void setNickname(StringProperty nickname) {
		this.nickname = nickname;
	}

	public StringProperty getPortrayed() {
		return this.portrayed;
	}

	public void setPortrayed(StringProperty portrayed) {
		this.portrayed = portrayed;
	}

	public ListProperty<String> getCategory() {
		return this.category;
	}

	public void setCategory(ListProperty<String> category) {
		this.category = category;
	}

	public ListProperty<String> getAppearance() {
		return this.appearance;
	}

	public void setAppearance(ListProperty<String> appearance) {
		this.appearance = appearance;
	}

//	public static CharacterModel toFxBean(CharacterItem item) {
//
//		CharacterModel modelfx = new CharacterModel();
//
//		if (item == null) {
//
//			throw new NullPointerException("Null Item");
//		}
//
//		modelfx.setAppearance(new SimpleListProperty<>(FXCollections.observableArrayList()));
//		modelfx.setBirthday(new SimpleStringProperty(item.getBirthday()));
//		modelfx.setCategory(new SimpleListProperty<>(FXCollections.observableArrayList()));
//		modelfx.setId(new SimpleIntegerProperty(item.getCharId()));
//		modelfx.setImg(new SimpleStringProperty(item.getImg()));
//		modelfx.setName(new SimpleStringProperty(item.getName()));
//		modelfx.setNickname(new SimpleStringProperty(item.getNickname()));
//		modelfx.setOccupation(new SimpleListProperty<>(FXCollections.observableArrayList()));
//		modelfx.setPortrayed(new SimpleStringProperty(item.getPortrayed()));
//		modelfx.setStatus(new SimpleStringProperty(item.getStatus()));
//
//		return modelfx;
//	}

}
