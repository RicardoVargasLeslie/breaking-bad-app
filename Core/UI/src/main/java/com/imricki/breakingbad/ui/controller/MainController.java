package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class MainController implements Initializable {

	private static final Logger LOGGER = Logger.getLogger(MainController.class.getName());

	@FXML
	@Getter
	private BorderPane borderPane;

	@Autowired
	private MenuController menuController;

	@Autowired
	private TabPaneController tabPaneController;

	public MainController() {

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/mainView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.menuController = new MenuController();
		this.borderPane.setTop(this.menuController.getMenuBar());

		this.tabPaneController = new TabPaneController();
		this.borderPane.setCenter(this.tabPaneController.getTabPane());

	}

}
