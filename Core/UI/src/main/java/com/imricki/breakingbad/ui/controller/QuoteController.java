package com.imricki.breakingbad.ui.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.ui.utils.LoaderUtils;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import lombok.Getter;

@Controller
public class QuoteController implements Initializable {

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

	private ObjectProperty<QuoteModel> quoteFx = new SimpleObjectProperty<>();

	public QuoteController() {

		LoaderUtils.loadView("/fx/quoteView.fxml", this);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// set cell value factories
		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

	}

}
