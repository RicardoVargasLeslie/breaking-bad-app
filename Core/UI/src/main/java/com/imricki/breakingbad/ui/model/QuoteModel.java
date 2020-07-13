package com.imricki.breakingbad.ui.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class QuoteModel {

	
	private StringProperty quote_id= new SimpleStringProperty(this,"quote_id");

	private StringProperty quote= new SimpleStringProperty(this,"quote");

	private StringProperty author = new SimpleStringProperty(this,"author");

	private StringProperty series= new SimpleStringProperty(this,"series");

}
