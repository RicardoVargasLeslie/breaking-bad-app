package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class MainController implements Initializable {

	@FXML
	@Getter
	private BorderPane borderPane;

	@Autowired
	MenuController menuController;

	@FXML
	private TabPane tabPane;

	@FXML
	private Tab quoteTab;

	@FXML
	private Tab characterTab;

	@FXML
	private Tab episodeTab;

	@FXML
	private Tab deathTab;

	public MainController() {

		LoaderUtils.loadView("/fx/mainView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.menuController = new MenuController();
		this.borderPane.setTop(this.menuController.getMenuBar());
		this.borderPane.setCenter(this.tabPane);

	}

}
