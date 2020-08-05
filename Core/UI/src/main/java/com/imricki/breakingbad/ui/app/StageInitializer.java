package com.imricki.breakingbad.ui.app;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.imricki.breakingbad.ui.app.FxAppication.StageReadyEvent;
import com.imricki.breakingbad.ui.controller.QuoteController;

import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

	private QuoteController controller = new QuoteController();

	public StageInitializer() {

	}

	@Override
	public void onApplicationEvent(StageReadyEvent event) {

		Stage stage = event.getStage();
		stage.setScene(new Scene(this.controller.getComponentView()));
		stage.show();
	}

}
