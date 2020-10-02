package com.imricki.breakingbad.ui.utils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;

public class LoaderUtils {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private LoaderUtils() {

		LOGGER.setLevel(Level.SEVERE);
	}

	public static void loadView(String view, Object className) {

		try {
			if (view != null && className != null) {

				FXMLLoader loader = new FXMLLoader(className.getClass().getResource(view));
				loader.setController(className);
				loader.load();
			}
		} catch (IOException e) {

			LOGGER.severe("Faileeeeeeeeeeeeeeeeeed to load view: " + e.getStackTrace().toString());
		}
	}
}
