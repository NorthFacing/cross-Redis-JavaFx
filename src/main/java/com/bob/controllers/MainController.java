package com.bob.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SplitPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

	@FXML
	private SplitPane centrePane;

	@FXML
	private void addConn() {

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// resize dividerPosition when zooming the window
		centrePane.widthProperty().addListener((observableVal, oldVal, newVale) -> centrePane.setDividerPositions(0.2, 0.8));
	}

}
