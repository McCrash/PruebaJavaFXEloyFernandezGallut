package vista;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}
	
	public void showFreeSolo() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(control.MainFX.class.getResource("../vista/FreeSolo.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			Stage sendStage = new Stage();
			sendStage.setTitle("FreeSolo");

			Scene scene = new Scene(page);
			sendStage.setScene(scene);

			sendStage.show();

		} catch (Exception e) {

		}

	}

	
	
	
	@FXML
	private void openStage() {
		showFreeSolo();
	}
	
	@FXML
	private void closeApp() {
		System.exit(0);
	}

}




