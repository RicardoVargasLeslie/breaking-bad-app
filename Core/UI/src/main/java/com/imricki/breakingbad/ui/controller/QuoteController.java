package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.ui.service.QuoteUI;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
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

	ListProperty<QuoteModel> fxlist = new SimpleListProperty<>(FXCollections.observableArrayList());

	public QuoteController() {

		// LoaderUtils.loadView("/fx/quoteView.fxml", this);

		// this.fxlist = this.service.getAll();

		try {
			FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/quoteView.fxml"));
			loader.setController(this);

			loader.load();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		ListProperty<QuoteModel> fxlist = new SimpleListProperty<>(FXCollections.observableArrayList());
//		fxlist.add(new QuoteModel(new QuoteDto(2, "ddd", "aaaa", "yyyy")));

		ListProperty<QuoteModel> list = new SimpleListProperty<QuoteModel>();

		if (this.service.getAll() == null) {

			System.out.println("Nuuuuuuuuuuuuul");
		}
//		this.tableView.itemsProperty().bind(this.service.getAll());

//		ListProperty<QuoteModel> fxlist = new SimpleListProperty<>(FXCollections.observableArrayList());
//		fxlist = this.service.getAll();
//
////		fxlist.add(new QuoteModel(new QuoteDto(2, "ddd", "aaaa", "yyyy")));
//
//		System.out.print(fxlist.toString());
//
//		this.tableView.itemsProperty().bind(fxlist);
//		// set cell value
		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

	}

}
