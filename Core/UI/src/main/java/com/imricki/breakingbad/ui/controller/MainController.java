package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class MainController implements Initializable {

	@FXML
	@Getter
	private BorderPane manViewPane;

	@Autowired
	private QuoteController quoteController;

	public MainController() {

		LoaderUtils.loadView("/fx/mainView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.quoteController = new QuoteController();
		this.manViewPane.setCenter(this.quoteController.getQuotePane());
	}

}
