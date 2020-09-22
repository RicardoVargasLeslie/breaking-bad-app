package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;

@Controller
public class QuoteController implements Initializable {

	@FXML
	private TabPane tabView;

	@Autowired
	private MainController mainController = new MainController();

	@FXML
	private Button buttonview;

	public QuoteController() {

		LoaderUtils.loadView("/fx/tabview.fxml", this);

		this.mainController.getManViewPane().setCenter(this.getTabView());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public TabPane getTabView() {
		return this.tabView;
	}
}
