package com.imricki.breakingbad.ui.app;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.imricki.breakingbad.ui.controller.MainController;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

	private MainController controller = new MainController();

	private Stage stage;
	private Scene scene;

	public StageInitializer() {

	}

	@Override
	public void onApplicationEvent(StageReadyEvent event) {

		this.stage = event.getStage();
		this.stage.setScene(new Scene(this.controller.getManViewPane()));
		this.stage.show();
	}

	public Stage getStage() {
		return this.stage;
	}

	public void goTo(Parent root) {
		this.scene.setRoot(root);
	}
}
