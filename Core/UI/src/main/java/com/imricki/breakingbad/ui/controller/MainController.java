package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class MainController implements Initializable {

	@FXML
	@Getter
	private BorderPane mainPane;

	@FXML
	@Getter
	private Tab tab1;

	@FXML
	@Getter
	private Tab tab2;

	private ObjectProperty<QuoteController> quoteController;

	public MainController() {

		LoaderUtils.loadView("/fx/parentView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.quoteController = new SimpleObjectProperty<>(this, "", new QuoteController());
	}

}
