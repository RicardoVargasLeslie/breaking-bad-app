package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

@Controller
public class MainController implements Initializable {

	@FXML
	private BorderPane manViewPane;

	private MainController mainController;

	private ObjectProperty<QuoteController> quoteController;

	public MainController() {

		LoaderUtils.loadView("/fx/mainView.fxml", this);
	}

	public BorderPane getManViewPane() {
		return this.manViewPane;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.quoteController = new SimpleObjectProperty<QuoteController>();
	}

	@FXML
	private void initialize() {

		this.quoteController.get().injectMainController(this.mainController);
	}

}
