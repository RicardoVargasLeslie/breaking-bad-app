package com.imricki.breakingbad.ui.model;

import javafx.beans.property.StringProperty;
import lombok.Data;

@Data
public class QuoteModel {

	private StringProperty quote_id;

	private StringProperty quote;

	private StringProperty author;

	private StringProperty series;

}
