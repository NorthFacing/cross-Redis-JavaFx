package com.bob;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CrossRedis extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
		primaryStage.setTitle("crossRedis");
		Scene scene = new Scene(root);
		scene.getStylesheets().addAll("css/dark-theme.css");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
