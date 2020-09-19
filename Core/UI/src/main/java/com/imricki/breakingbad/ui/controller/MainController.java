package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.BorderPane;
import lombok.Getter;
import lombok.Setter;

@Controller
public class MainController implements Initializable {

	@Getter
	@Setter
	@FXML
	private BorderPane mainPane;

	@Getter
	@FXML
	private TitledPane titledPane;

	private ObjectProperty<QuoteController> quoteController;

	public MainController() {

		LoaderUtils.loadView("/fx/parentView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.quoteController = new SimpleObjectProperty<>(this, "", new QuoteController());
	}

}
