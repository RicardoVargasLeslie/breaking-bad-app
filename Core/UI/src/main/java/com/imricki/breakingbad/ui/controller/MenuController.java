package com.imricki.breakingbad.ui.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import lombok.Getter;

@Controller
public class MenuController {

	@FXML
	@Getter
	private MenuBar menuBar;

	public MenuController() {

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/quoteView.fxml"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
