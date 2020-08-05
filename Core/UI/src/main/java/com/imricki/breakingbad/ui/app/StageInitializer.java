package com.imricki.breakingbad.ui.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.imricki.breakingbad.ui.app.App.StageReadyEvent;
import com.imricki.breakingbad.ui.controller.QuoteController;

import javafx.scene.Scene;
import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

//	//@Value("classpath:/fx/view.fxml")
//	private Resource chartResource;
	private ApplicationContext applicationContext;

	@Autowired
	private QuoteController controller = new QuoteController();

	public StageInitializer(ApplicationContext applicationContext) {

		this.applicationContext = applicationContext;
	}

	@Override
	public void onApplicationEvent(StageReadyEvent event) {

//			FXMLLoader fxmlLoader = new FXMLLoader(this.chartResource.getURL());
//			fxmlLoader.setControllerFactory(aClass -> this.applicationContext.getBean(aClass));
//			Parent parent = fxmlLoader.load();

		Stage stage = event.getStage();
		stage.setScene(new Scene(this.controller.getComponentView()));
		stage.show();
	}

}
