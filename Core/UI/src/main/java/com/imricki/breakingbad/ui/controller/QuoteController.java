package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.ui.service.QuoteUI;

import javafx.beans.property.ListProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class QuoteController implements Initializable {

	@Lazy
	@Autowired
	private QuoteUI service;

	@FXML
	@Getter
	private BorderPane borderPane;

	@FXML
	private TableView<QuoteModel> tableView;

	@FXML
	private TableColumn<QuoteModel, Number> idCol;

	@FXML
	private TableColumn<QuoteModel, String> quoteCol;

	@FXML
	private TableColumn<QuoteModel, String> authorCol;

	@FXML
	private TableColumn<QuoteModel, String> seriesCol;

	@FXML
	private ImageView authorImageView;

	@FXML
	private Label quoteLabel, seriesLabel, quote_idLabel;

	public QuoteController() {

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/quoteView.fxml"));
			loader.setController(this);

			loader.load();

			this.init();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		// this.tableView.itemsProperty().bind(this.service.getAll());
//
//		// set cell value
//		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
//		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
//		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
//		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

	}

	private void init() {

		ListProperty<QuoteModel> list = this.service.getAll();

		for (int i = 0; i < list.size(); i++) {

			System.err.println(list.toString());
		}

		// this.tableView.itemsProperty().bind(this.service.getAll());

		// set cell value
		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());
	}
}
