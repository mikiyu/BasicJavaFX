package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {


	private AnchorPane mypane;
	@Override
	public void start(Stage stage) {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Layouts.fxml"));
		
		//Esto es para que la ventana no sea resizable
		BorderPane bp = new BorderPane();
	    bp.setPadding(new Insets(10, 50, 50, 50));
	    Scene scene = new Scene(bp);
	    stage.setScene(scene);
	    stage.setResizable(false);
	    stage.show();
		
		try {
			mypane = (AnchorPane) loader.load();
			
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		stage.setTitle("Práctica");
		stage.setScene(new Scene(mypane));
		stage.show();

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
