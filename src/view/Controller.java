package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

	@FXML Button Edit;
	@FXML Button Delete;
	@FXML Button Add;
	@FXML TextField a;
	@FXML TextField b;
	@FXML TextField c;
	@FXML TextField d;
	@FXML ListView<String> songList;
	private ObservableList<String> observeList;              
	  
	   public void start(Stage mainStage) {                
       
		   observeList = FXCollections.observableArrayList("No song has been added yet");               
	   songList.setItems(observeList);
	   songList.getSelectionModel().select(0);
	      
	   }

	
	public void editAction(ActionEvent e) {
		a.setText(String.format("Edit pressed"));
	}
	
	public void addAction(ActionEvent e) {
		b.setText(String.format("add pressed"));
	}
	
	
}

