package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

@Controller
public class CharacterController implements Initializable {

	public CharacterController() {

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/"));
			loader.setController(this);
			loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
