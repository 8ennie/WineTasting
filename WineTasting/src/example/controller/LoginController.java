package example.controller;

import java.net.URL;
import java.util.ResourceBundle;

import example.model.Login;
import example.model.LoginProcess;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class LoginController implements Initializable {  

	private MainController mainCon;
	
	public LoginController(MainController mainController){
		this.mainCon = mainController;
	}
	
    @FXML
    TextField userId;
    @FXML
    PasswordField password;
    @FXML
    Button login;
    @FXML
    TextArea console;

    private Login loginObject; 
    private String loginFile = "login.txt";
    private LoginProcess lp;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    
    	loginObject = new Login();
    	
    	login.setOnAction((event) -> {
    		loginObject.setUsernameAndPassword(userId.getText(), password.getText());
    		console.setText("Hello " + loginObject.getUsername());
    		lp = new LoginProcess(loginFile, loginObject);
    		lp.addEventHandler(WorkerStateEvent.WORKER_STATE_SUCCEEDED,
    			    new EventHandler<WorkerStateEvent>() {
    		    @Override
    		    public void handle(WorkerStateEvent t) {
    		    	Boolean  result = (Boolean) lp.getValue();
    		        if(result){
    		        	mainCon.gotoNextScene("/example/view/Hello.fxml", new HelloController(loginObject.getUsername()));
    		        } else {
    		        	console.setText("Sorry Wrong ID and Password");
    		        }
    		    }
    		});
    		
    		new Thread(lp).start(); 
    		
    	});    	
    
    	
    }
	
    
    
}


