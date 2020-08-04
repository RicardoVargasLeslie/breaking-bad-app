package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Controller
public class QuoteController implements Initializable {

	@Getter
	@FXML
	private BorderPane componentView;

	@Getter
	@FXML
	private Button buttonview;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
