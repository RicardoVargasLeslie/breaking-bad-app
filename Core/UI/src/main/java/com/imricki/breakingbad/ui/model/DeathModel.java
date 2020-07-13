package com.imricki.breakingbad.ui.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class DeathModel {

	private IntegerProperty id = new SimpleIntegerProperty(this,"id");
	
	private StringProperty death =new SimpleStringProperty(this,"quote_id");
	
	private StringProperty cause=new SimpleStringProperty(this,"quote_id");
	
	private StringProperty responsible=new SimpleStringProperty(this,"quote_id");
	
	private StringProperty lastWords=new SimpleStringProperty(this,"quote_id");
	
	private StringProperty season=new SimpleStringProperty(this,"quote_id");
	
	private IntegerProperty episode = new SimpleIntegerProperty(this,"id");
	
	private IntegerProperty numberOfdeaths = new SimpleIntegerProperty(this,"id");

}
