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
	private BorderPane borderPane;

	@Autowired
	private MenuController menuController;

	@Autowired
	private TabPaneController tabPaneController;

	public MainController() {

		LoaderUtils.loadView("/fx/mainView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.menuController = new MenuController();
		this.borderPane.setTop(this.menuController.getMenuBar());

		this.tabPaneController = new TabPaneController();
		this.borderPane.setCenter(this.tabPaneController.getTabPane());

	}

}
