package com.imricki.breakingbad.ui.app;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.imricki.breakingbad.ui.model.DeathModel;
import com.imricki.breakingbad.ui.service.DeathUI;

import javafx.application.Application;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Aplication.class);

//	@Autowired
//	private CharacterClient character;
//
//	@Autowired
//	QuoteUI uiservice;
//
//	@Autowired
//	private QuoteClient quote;
//
//	@Autowired
//	private DeathClient death;

	@Autowired
	private DeathUI deathUui;

	public static void main(String[] args) {

		Application.launch(FxAppication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

//			QuoteItem q = this.quote.getRandom();

//			DeatDECount total = this.quote.ge

//			List<QuoteModel> list = this.uiservice.getAll();
//			list.forEach(System.out::println);

//			QuoteModel m = this.uiservice.getRandom();
//
//			QuoteModel mf = this.uiservice.findBy(2);

			List<DeathModel> gg = this.deathUui.getAll();

			for (int i = 0; i < gg.size(); i++) {

				System.err.println(gg.get(i));
			}

		};
	}
}
