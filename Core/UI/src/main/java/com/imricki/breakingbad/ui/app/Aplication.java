package com.imricki.breakingbad.ui.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.imricki.breakingbad.domain.service.CharacterClient;
import com.imricki.breakingbad.domain.service.DeathClient;
import com.imricki.breakingbad.domain.service.QuoteClient;

import javafx.application.Application;

@SpringBootApplication(scanBasePackages = { "com" })
public class Aplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Aplication.class);

	@Autowired
	private CharacterClient character;

	@Autowired
	private QuoteClient quote;

	@Autowired
	private DeathClient death;

	public static void main(String[] args) {

		Application.launch(FxAppication.class, args);
	}

//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
//
	// QuoteItem q = this.quote.getRandom();
//
//			DeathCount total = this.death.deathCount();
//// en realidad devuelves una lista de un elemento
	// System.err.println(q);
//			System.err.println(total);
//			List<QuoteItem> list = this.quote.getAll();
//			list.forEach(System.out::println);
//
//		};
	// }
}
