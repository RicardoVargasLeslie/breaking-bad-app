package com.imricki.breakingbad.ui.app;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.imricki.breakingbad.ui.controller.MainController;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

	private MainController controller;

	public static Stage primaryStage;

	private Scene scene;

	public StageInitializer() {

	}

	@Override
	public void onApplicationEvent(StageReadyEvent event) {

		this.controller = new MainController();
		primaryStage = event.getStage();
		primaryStage.getIcons().add(new Image("/images/logo-256x256.png"));
		primaryStage.setScene(new Scene(this.controller.getBorderPane()));
		primaryStage.show();
	}

	public void goTo(Parent root) {
		this.scene.setRoot(root);
	}
}
