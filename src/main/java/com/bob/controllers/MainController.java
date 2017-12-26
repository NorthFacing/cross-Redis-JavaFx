package com.bob.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

	@FXML
	private void addConn(){
		System.out.println("Hello redis");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

}
