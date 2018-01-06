module bob.crossRedis {

	requires java.base;
	requires java.logging;
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.controls;

	requires com.jfoenix;
	requires de.jensd.fx.glyphs.fontawesome;

	requires lettuce;
	requires org.apache.commons.lang3;

	exports bob.crossRedis;
	exports bob.crossRedis.controllers;

}