module bob.crossRedis {

	requires java.base;
	requires java.logging; // TODO 是否使用此日志包？
	requires java.desktop;
	requires javafx.fxml;
	requires javafx.controls;

//	requires slf4j.api;

	requires com.jfoenix;
	requires de.jensd.fx.glyphs.fontawesome;

	exports bob.crossRedis;
	exports bob.crossRedis.controllers;

}