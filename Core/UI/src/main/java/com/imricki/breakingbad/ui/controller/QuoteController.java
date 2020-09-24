package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

@Controller
public class QuoteController implements Initializable {

	@FXML
	private BorderPane borderPane;

	@FXML
	private TableView<?> tableView;

	@FXML
	private TableColumn<?, ?> idCol;

	@FXML
	private TableColumn<?, ?> quoteCol;

	@FXML
	private TableColumn<?, ?> authorCol;

	@FXML
	private TableColumn<?, ?> seriesCol;

	@FXML
	private ImageView authorImageView;

	@FXML
	private Label quote_idLabel;

	@FXML
	private Label quoteLabel;

	@FXML
	private Label seriesLabel;

	public QuoteController() {

		LoaderUtils.loadView("/fx/quoteView.fxml", this);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

}
