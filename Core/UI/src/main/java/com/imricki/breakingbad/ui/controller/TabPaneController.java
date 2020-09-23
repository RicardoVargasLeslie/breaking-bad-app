package com.imricki.breakingbad.ui.controller;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import lombok.Getter;

@Controller
public class TabPaneController {

	@FXML
	@Getter
	private TabPane tabPane;

	@FXML
	private Tab quoteTab;

	@FXML
	private Tab characterTab;

	@FXML
	private Tab deathTab;

	@FXML
	private Tab episodeTab;

	public TabPaneController() {

		LoaderUtils.loadView("/fx/tabPaneView.fxml", this);
	}
}
