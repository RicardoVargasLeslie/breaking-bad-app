package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;

@Controller
public class QuoteController implements Initializable {

	@FXML
	private TitledPane quotePane;

	@FXML
	private Button buttonview;

	public QuoteController() {

		LoaderUtils.loadView("/fx/tabview.fxml", this);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public TitledPane getQuotePane() {
		return this.quotePane;
	}
}
