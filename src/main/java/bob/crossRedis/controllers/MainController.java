package bob.crossRedis.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController implements Initializable {

	@FXML
	public StackPane root;
	@FXML
	public SplitPane centrePane;

	private AddConnController addController;

	@FXML
	public void addConn() {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/jfx_fxml/addConn.fxml"));
			Parent addConn = fxmlLoader.load();
			addController = fxmlLoader.getController();

			Stage stage = new Stage(StageStyle.DECORATED);
			stage.setTitle("新增连接");
			stage.setScene(new Scene(addConn));
			stage.show();
		} catch (IOException ex) {
			Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// resize dividerPosition when zooming the window
		centrePane.widthProperty().addListener((observableVal, oldVal, newVale) -> centrePane.setDividerPositions(0.2, 0.8));
	}

}
