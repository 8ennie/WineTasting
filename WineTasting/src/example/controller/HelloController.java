package example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController implements Initializable{

	private String userName;
	
	public HelloController(String user){
		this.userName = user;
	}
	
	@FXML
    Label userNameLabel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		userNameLabel.setText(userName);
		
	}

}
