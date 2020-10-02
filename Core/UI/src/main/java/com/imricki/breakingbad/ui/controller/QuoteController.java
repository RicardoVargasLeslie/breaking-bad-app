package com.imricki.breakingbad.ui.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

	// look at this
	// @Autowired
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

		this.UIservice = new QuoteUI();

		// LoaderUtils.loadView("/fx/quoteView.fxml", this);

		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/fx/quoteView.fxml"));
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

//		if (!this.service.getAll().isEmpty()) {
//
//			System.err.println("Not empty");
//		}

		this.tableView.itemsProperty().bind(this.UIservice.getAll());

//		// set cell value
		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

	}

}
