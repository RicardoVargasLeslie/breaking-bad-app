package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.app.StageInitializer;
import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class QuoteController implements Initializable {

	@Getter
	@FXML
	private BorderPane componentView;

	StageInitializer init;

	@Getter
	@FXML
	private Button buttonview;

	public QuoteController(StageInitializer init) {

		this.init = init;

		LoaderUtils.loadView("/fx/view.fxml", this);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		this.init.getStage().setScene(new Scene(this.componentView));
	}

}
