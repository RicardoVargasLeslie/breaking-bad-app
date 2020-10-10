package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.ui.service.QuoteUI;

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

	private static final Logger LOGGER = Logger.getLogger(QuoteController.class.getName());

//	@Autowired getting NP
	private QuoteUI UIservice;

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

		LOGGER.info("Obj Constructor");

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

		this.UIservice = new QuoteUI();

		this.UIservice.getAll().forEach(e -> System.err.println(e.toString()));
//
//		System.out.println(this.UIservice.hola());
//
//		System.err.println(this.UIservice.getAll());
//
//		this.tableView.itemsProperty().bind(this.UIservice.getAll());
//
////		// set cell value
//		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
//		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
//		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
//		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

	}

}
