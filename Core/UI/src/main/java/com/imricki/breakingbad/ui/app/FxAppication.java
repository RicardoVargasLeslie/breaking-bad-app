package com.imricki.breakingbad.ui.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

@SpringBootApplication(scanBasePackages = { "com" })
public class FxAppication extends Application {

	private ConfigurableApplicationContext applicationContext;

	@Override
	public void init() {
		this.applicationContext = new SpringApplicationBuilder(Aplication.class).run();
	}

	@Override
	public void start(Stage stage) {

		this.applicationContext.publishEvent(new StageReadyEvent(stage));
	}

	@Override
	public void stop() {
		this.applicationContext.close();
		Platform.exit();
	}

}
