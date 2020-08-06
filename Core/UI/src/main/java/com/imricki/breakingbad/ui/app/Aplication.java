package com.imricki.breakingbad.ui.app;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.imricki.breakingbad.domain.dto.DeathCount;
import com.imricki.breakingbad.domain.item.QuoteItem;
import com.imricki.breakingbad.domain.service.CharacterClient;
import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.domain.service.QuoteClient;
import com.imricki.breakingbad.ui.model.QuoteModel;
import com.imricki.breakingbad.ui.service.QuoteUI;

import javafx.application.Application;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Aplication.class);

	@Autowired
	private CharacterClient character;

	@Autowired
	QuoteUI uiservice;

	@Autowired
	private QuoteClient quote;

	@Autowired
	private DeathClient death;

	public static void main(String[] args) {

		Application.launch(FxAppication.class, args);
	}

	@Bean
	public CommandLineRunner run() throws Exception {
		return args -> {

			QuoteItem q = this.quote.getRandom();

			DeathCount total = this.death.deathCount();

			System.err.println(q);
			System.err.println(total);
			List<QuoteModel> list = this.uiservice.getAll();
			list.forEach(System.out::println);

		};
	}
}
