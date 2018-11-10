package application.controller;
/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{
	
	private final String USERNAME = "test";
	private final String USERPW = "123456";

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtUsername"
    private TextField txtUsername; // Value injected by FXMLLoader

    @FXML // fx:id="pfPassword"
    private PasswordField pfPassword; // Value injected by FXMLLoader

    private MainController mainCon;

    
    @FXML
    void login(ActionEvent event) {
    	System.out.println("login button");

    	if (txtUsername.getText() == USERNAME && pfPassword.getText() == USERPW ) {
			System.out.println("Login erfolgreich");
		} else {
			System.out.println("Login fehlgeschlagen");
		}
    	mainCon.gotoOptions();
    	
    }

    @FXML
    void register(ActionEvent event) {

    }

	public LoginController(MainController mainController){
		this.mainCon = mainController;
	}
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Login.fxml'.";
        assert pfPassword != null : "fx:id=\"pfPassword\" was not injected: check your FXML file 'Login.fxml'.";

    }

	
}
