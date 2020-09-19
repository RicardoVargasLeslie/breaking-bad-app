package com.imricki.breakingbad.ui.model;

import com.imricki.breakingbad.domain.item.CharacterItem;

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
public class CharacterModel {

	private IntegerProperty id = new SimpleIntegerProperty(this, "id");

	private StringProperty name = new SimpleStringProperty(this, "name");

	private StringProperty birthday = new SimpleStringProperty(this, "birthday");

	private ListProperty<String> occupation = new SimpleListProperty<>(this, "occupation",
			FXCollections.observableArrayList());

	private StringProperty img = new SimpleStringProperty(this, "img");

	private StringProperty status = new SimpleStringProperty(this, "status");

	private StringProperty nickname = new SimpleStringProperty(this, "nickname");

	private ListProperty<String> appearance = new SimpleListProperty<>(this, "appearance",
			FXCollections.observableArrayList());

	private StringProperty portrayed = new SimpleStringProperty(this, "portrayed");

	private ListProperty<String> category = new SimpleListProperty<>(this, "category",
			FXCollections.observableArrayList());

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

	public CharacterModel toFxBean(CharacterItem item) {

		CharacterModel modelfx = new CharacterModel();

		if (item == null) {

			throw new NullPointerException("Null Item");
		}

		modelfx.setAppearance(new SimpleListProperty<>(FXCollections.observableArrayList()));
		modelfx.setBirthday(new SimpleStringProperty(this, item.getBirthday()));
		modelfx.setCategory(new SimpleListProperty<>(FXCollections.observableArrayList()));
		modelfx.setId(new SimpleIntegerProperty(this, String.valueOf(item.getCharId())));
		modelfx.setImg(new SimpleStringProperty(this, item.getImg()));
		modelfx.setName(new SimpleStringProperty(this, item.getName()));
		modelfx.setNickname(new SimpleStringProperty(this, item.getNickname()));
		modelfx.setOccupation(new SimpleListProperty<>(FXCollections.observableArrayList()));
		modelfx.setPortrayed(new SimpleStringProperty(this, item.getPortrayed()));
		modelfx.setStatus(new SimpleStringProperty(this, item.getStatus()));

		return modelfx;
	}

}
