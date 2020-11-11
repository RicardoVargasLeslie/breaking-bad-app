package com.imricki.breakingbad.ui.controller;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import lombok.Getter;

@Controller
public class MenuController {

	@FXML
	@Getter
	private MenuBar menuBar;

	private static final Logger LOGGER = Logger.getLogger(MenuController.class.getName());

	public MenuController() {

		LOGGER.info("Obj Constructor");

	}

}
