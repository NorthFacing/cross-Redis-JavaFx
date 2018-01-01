package bob.crossRedis;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class CrossRedis extends Application {

//	private static Logger logger = LoggerFactory.getLogger(CrossRedis.class);

	public static void main(String[] args) {
		try {
			launch(args);
		} catch (Exception e) {
			e.printStackTrace();
//			logger.error(e.getMessage());
//			logger.error(e.getCause().toString());
//			logger.error(e.getStackTrace().toString());
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
