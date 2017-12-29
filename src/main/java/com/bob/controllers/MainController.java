package com.bob.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

	@FXML
	private StackPane root;
	@FXML
	private SplitPane centrePane;

	@FXML
	private void addConn() {

//		JFXTextField username = new JFXTextField();
//		username.setPromptText("username");
//		JFXPasswordField password = new JFXPasswordField();
//		password.setPromptText("password");
//
//		StackPane content = new StackPane();
//		content.getChildren().addAll(username,password);
//
//		JFXDialogLayout layout = new JFXDialogLayout();
//		layout.setHeading(new Text("新增连接"));
//		layout.setBody(content);
//
//		JFXButton okay = new JFXButton("确定");
//		JFXButton cancle = new JFXButton("取消");
//		layout.setActions(cancle, okay);
//
//		JFXDialog dialog = new JFXDialog(root, layout, JFXDialog.DialogTransition.CENTER, false);
//
//		okay.setOnAction(e -> {
//			System.out.println("Okay");
//		});
//		cancle.setOnAction(e -> dialog.close());
//
//		dialog.show();

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// resize dividerPosition when zooming the window
		centrePane.widthProperty().addListener((observableVal, oldVal, newVale) -> centrePane.setDividerPositions(0.2, 0.8));
	}

}
