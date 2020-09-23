package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import lombok.Getter;

@Controller
public class MenuController implements Initializable {

	@FXML
	@Getter
	private MenuBar menuBar;

	public MenuController() {

		LoaderUtils.loadView("/fx/menu.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}
}
