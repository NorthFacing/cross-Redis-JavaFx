package bob.crossRedis;

import bob.crossRedis.service.impl.ConnectionImpl;
import bob.crossRedis.utils.LoggerUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CrossRedis extends Application {

	private static final Logger LOGGER = LoggerUtil.getLogger(CrossRedis.class);

	public static void main(String[] args) {
		try {
			ConnectionImpl connection = new ConnectionImpl();
			connection.login("localhost",6379,"adolphor@redis");

			launch(args);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "CrossRedis application error: ", e);
		}
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/jfx_fxml/Main.fxml"));
		primaryStage.setTitle("crossRedis");
		Scene scene = new Scene(root);
		// bar icon
		primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/jfx_image/icons/crossRedis.icns")));
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
