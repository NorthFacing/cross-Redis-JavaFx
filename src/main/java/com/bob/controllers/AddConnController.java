package com.bob.controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class AddConnController implements Initializable {

	@FXML
	private JFXTextField username;
	@FXML
	private JFXPasswordField password;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
	}

	@FXML
	private void handleLoginButtonAction(ActionEvent event) {
		String uname = username.getText();

		if (true) {
			System.out.println("校验登录账号...。。");
		} else {
			username.getStyleClass().add("wrong-credentials");
			password.getStyleClass().add("wrong-credentials");
		}
	}

	@FXML
	private void handleCancelButtonAction(ActionEvent event) {
		System.exit(0);
	}

}