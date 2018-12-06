package login;

import java.nio.channels.SeekableByteChannel;

import org.omg.CORBA.VersionSpecHelper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.BlurType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 * 
 * @author Miguel
 * @version 1.0
 * @see BlurController
 *
 */


public class Main extends Application {

	public void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass()
				.getResource("ejemplo.fxml"));
		AnchorPane pane = loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
