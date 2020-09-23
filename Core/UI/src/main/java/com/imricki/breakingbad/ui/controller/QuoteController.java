package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import lombok.Getter;

@Controller
public class QuoteController implements Initializable {

	@FXML
	@Getter
	private GridPane gridPane;

	public QuoteController() {

		LoaderUtils.loadView("/fx/quoteView.fxml", this);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
