package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.beans.property.ObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;

@Controller
public class MainController implements Initializable {

	@FXML
	private TabPane mainTab;

	private ObjectProperty<QuoteController> quoteController;

	public MainController() {

		LoaderUtils.loadView("/fx/parentView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
