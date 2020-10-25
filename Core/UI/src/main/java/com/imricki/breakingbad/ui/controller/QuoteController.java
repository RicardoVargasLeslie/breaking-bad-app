package com.imricki.breakingbad.ui.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import java.util.stream.Collectors;

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

		//LoaderUtils.loadView("/fx/quoteView.fxml", this);

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

		this.tableView.itemsProperty().bind(this.UIservice.getAll());
		// set cell value
		this.idCol.setCellValueFactory(v -> v.getValue().getQuote_id());
		this.quoteCol.setCellValueFactory(v -> v.getValue().getQuote());
		this.authorCol.setCellValueFactory(v -> v.getValue().getAuthor());
		this.seriesCol.setCellValueFactory(v -> v.getValue().getSeries());

		//
		//		List<String> lines1 = this.leerLineaALinea(new File("datos.csv"), Charset.forName("UTF-8"));
		//		lines1.stream().forEach(l -> {
		//
		//	l.split(regex)
		//			String [] parts = l.split(",");
		//			String username = parts[0];
		//			String password = parts[1];
		//			System.out.println("Usuario: " + parts[0] + " / Contraseña: " + parts[1]);
		//		});

		//	    stringList.forEach(s -> System.out.println(s));

		List<String> lines1 = this.leerLineaALinea(new File("datos.csv"), StandardCharsets.UTF_8);
		lines1.stream().map(e -> e.split(",")).collect(Collectors.toList());


	}

	private List<String> leerLineaALinea(File file, Charset forName) {
		// TODO Auto-generated method stub
		return null;
	}



}
