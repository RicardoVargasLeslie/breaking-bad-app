package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

	private CharacterController characterController;

	private DeathController deathController;

	private EpisodeController episodeController;

	private QuoteController quoteController;

	public TabPaneController() {
		this.quoteController = new QuoteController();
		// LoaderUtils.loadView("/fx/paneView.fxml", this);

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
//		this.deathController = new DeathController();
//		this.episodeController = new EpisodeController();
		this.quoteTab.setContent(this.quoteController.getBorderPane());

	}
}
