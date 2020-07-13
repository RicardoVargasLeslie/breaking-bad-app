package com.imricki.breakingbad.ui.model;



import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class CharacterModel  {


	private IntegerProperty id= new SimpleIntegerProperty(this,"id");

	private StringProperty name=new SimpleStringProperty(this,"quote_id");

	private StringProperty birthday=new SimpleStringProperty(this,"quote_id");

	private ListProperty<String> occupation = new SimpleListProperty(this,"habilidades",FXCollections.observableArrayList());;

	private StringProperty img=new SimpleStringProperty(this,"quote_id");

	private StringProperty status=new SimpleStringProperty(this,"quote_id");

	private StringProperty nickname=new SimpleStringProperty(this,"quote_id");

	private ListProperty<Integer> appearance = new SimpleListProperty(this,"habilidades",FXCollections.observableArrayList());;

	private StringProperty portrayed=new SimpleStringProperty(this,"quote_id");

	private ListProperty<String> category;

}
