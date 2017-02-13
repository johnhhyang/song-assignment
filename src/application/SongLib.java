package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.Controller;
//import view.ListController;

public class SongLib extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader();   
		loader.setLocation(getClass().getResource("/view/songlib_UI.fxml"));
		AnchorPane root = (AnchorPane)loader.load();

		Controller listController = (Controller)loader.getController();
		listController.start(primaryStage);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show(); 

		
		
		
	/*	FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/songlib_UI.fxml"));
		loader.setController(new Controller());
		
		
		//loader.setLocation(SongLib.class.getResource("/view/songlib_UI.fxml"));
		//GridPane root = (GridPane)loader.load();
		AnchorPane root = (AnchorPane)loader.load();
		
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Song Library");
		primaryStage.setResizable(false);  
		primaryStage.show();*/
	}

	public static void main(String[] args){
		launch(args);
	}
	
	
}
