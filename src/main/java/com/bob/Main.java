package com.bob;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// 主面板
		BorderPane root = new BorderPane();

		// 导航栏
		HBox navBar = new HBox();

		root.setTop(navBar);

		// 左侧边栏-数据库
		VBox dbCol = new VBox();
		root.setLeft(dbCol);

		Scene scene = new Scene(root, 800, 600);

		primaryStage.setMinWidth(600);
		primaryStage.setMinHeight(400);
		primaryStage.setTitle("Hello World");
		primaryStage.setScene(scene);

		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
