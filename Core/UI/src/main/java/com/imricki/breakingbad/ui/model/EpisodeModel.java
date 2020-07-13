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
public class EpisodeModel {

	private IntegerProperty id= new SimpleIntegerProperty(this,"id");

	private StringProperty title =new SimpleStringProperty(this,"quote_id");

	private IntegerProperty season = new SimpleIntegerProperty(this,"id");

	private IntegerProperty episode= new SimpleIntegerProperty(this,"id");

	private StringProperty air_date=new SimpleStringProperty(this,"quote_id");

	private ListProperty<String> characters= new SimpleListProperty<String>(this,"habilidades",FXCollections.observableArrayList());;

	private StringProperty series=new SimpleStringProperty(this,"quote_id");

	

}
