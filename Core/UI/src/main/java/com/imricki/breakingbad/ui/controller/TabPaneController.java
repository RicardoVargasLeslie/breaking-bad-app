package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import lombok.Getter;

@Controller
public class TabPaneController implements Initializable {

	private static final Logger LOGGER = Logger.getLogger(TabPaneController.class.getName());

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

	private CharacterController characterController;

	private DeathController deathController;

	private EpisodeController episodeController;

	private QuoteController quoteController;

	public TabPaneController() {


		LOGGER.info("Obj Constructor");

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/paneView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		//		this.characterController = new CharacterController();
		//		this.quoteTab.setContent(null);
		//		this.deathController = new DeathController();
		//		this.quoteTab.setContent(null);
		//		this.episodeController = new EpisodeController();
		//		this.quoteTab.setContent(this.quoteController.getBorderPane());


	}
}
