package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;

import javafx.fxml.Initializable;

@Controller
public class EpisodeController implements Initializable {

	private static final Logger LOGGER = Logger.getLogger(EpisodeController.class.getName());

	public EpisodeController() {

		LOGGER.info("Obj Constructor");

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
