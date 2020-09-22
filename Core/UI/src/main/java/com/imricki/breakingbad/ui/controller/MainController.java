package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

@Controller
public class MainController implements Initializable {

	@FXML
	private BorderPane manViewPane;

	public MainController() {

		LoaderUtils.loadView("/fx/mainView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public BorderPane getManViewPane() {
		return this.manViewPane;
	}
}
