package control;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class MainFX extends Application {


	@Override
	public void start(Stage primaryStage) {
		try {
			openStage(primaryStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openStage(Stage escena) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../vista/Login.fxml"));
			AnchorPane panel = loader.load();
			//Font.loadFont(getClass().getResourceAsStream("../vista/assets/fonts/PoiretOne-Regular"), 20);
			escena.setScene(new Scene(panel));
			escena.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}