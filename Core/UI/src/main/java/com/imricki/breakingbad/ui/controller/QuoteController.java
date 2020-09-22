package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import lombok.Getter;

@Controller
public class QuoteController implements Initializable {

	@Getter
	@FXML
	private TabPane tabView;

	private MainController mainController = new MainController();

	@Getter
	@FXML
	private Button buttonview;

	public QuoteController() {

		LoaderUtils.loadView("/fx/tabview.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.mainController.getManViewPane().setCenter(this.tabView);
	}

	public void injectMainController(MainController mainController) {
		this.mainController = mainController;
	}

}
