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
import lombok.Getter;

@Controller
public class TabPaneController implements Initializable {

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

	@Autowired
	private CharacterController characterController;

	@Autowired
	private DeathController deathController;

	@Autowired
	private EpisodeController episodeController;

	@Autowired
	private QuoteController quoteController;

	public TabPaneController() {

		LoaderUtils.loadView("/fx/paneView.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.characterController = new CharacterController();
		this.deathController = new DeathController();
		this.episodeController = new EpisodeController();
		this.quoteController = new QuoteController();
		this.quoteTab.setContent(this.quoteController.getBorderPane());

	}
}
