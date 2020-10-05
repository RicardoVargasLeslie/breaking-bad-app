package com.imricki.breakingbad.ui.controller;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.scene.control.MenuBar;
import lombok.Getter;

@Controller
public class MenuController {

	@FXML
	@Getter
	private MenuBar menuBar;

	public MenuController() {

		LoaderUtils.loadView("/fx/menuView.fxml", this);
	}

}
