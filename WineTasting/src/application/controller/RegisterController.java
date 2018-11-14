package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.User;
import application.model.tasks.RegisterUser;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.Initializable;

public class RegisterController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtUsername"
	private TextField txtUsername; // Value injected by FXMLLoader

	@FXML // fx:id="pfPassword1"
	private PasswordField pfPassword1; // Value injected by FXMLLoader

	@FXML // fx:id="pfPassword2"
	private PasswordField pfPassword2; // Value injected by
	 
	@FXML
	private Label lblError;

	 private MainController mainCon;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Register.fxml'.";
		assert pfPassword1 != null : "fx:id=\"pfPassword1\" was not injected: check your FXML file 'Register.fxml'.";
		assert pfPassword2 != null : "fx:id=\"pfPassword2\" was not injected: check your FXML file 'Register.fxml'.";
	}

	
	public RegisterController(MainController mainController){
		this.mainCon = mainController;
	}
	
	@FXML
	void goBack(ActionEvent event) {
		mainCon.gotoLogin();
	}

	@FXML
	void register(ActionEvent event) {
		if(pfPassword1.getText().equals(pfPassword2.getText())) {
			User newUser = new User(txtUsername.getText(), pfPassword1.getText());
			RegisterUser rU = new RegisterUser(newUser);
			rU.addEventHandler(WorkerStateEvent.WORKER_STATE_SUCCEEDED,new EventHandler<WorkerStateEvent>() {
			    @Override
			    public void handle(WorkerStateEvent t) {
			    	Boolean  result = (Boolean) rU.getValue();
			        if(result){
			        	mainCon.gotoLogin();
			        } else {
			        }
			    }
			});
			new Thread(rU).start(); 
		}else {
			System.out.println("PW's nicht gleich");
			lblError.setText("Passwords are not the same");
		}
	}

}
