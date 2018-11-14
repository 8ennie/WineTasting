package application.controller;
/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.SessionInfos;
import application.model.data.User;
import application.model.tasks.LoginProcess;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtUsername"
	private TextField txtUsername; // Value injected by FXMLLoader

	@FXML // fx:id="pfPassword"
	private PasswordField pfPassword; // Value injected by FXMLLoader

	@FXML // fx:id="lblError"
	private Label lblError; // Value injected by FXMLLoader

	@FXML // fx:id="btnLogin"
	private Button btnLogin; // Value injected by FXMLLoader

	@FXML // fx:id="btnRegister"
	private Button btnRegister; // Value injected by FXMLLoader

	@FXML // fx:id="Login_AnchorPane"
	private AnchorPane login_AnchorPane; // Value injected by FXMLLoader

	private MainController mainCon;

	final EventHandler<Event> loginHandler = new EventHandler<Event>() {
		@Override
		public void handle(Event event) {
			System.out.println(event.getEventType());
			if(event.getEventType() != ActionEvent.ANY && event.getEventType() != KeyEvent.KEY_PRESSED) {
				return;
			}
			if(event.getEventType() != ActionEvent.ANY) {
				if(!((KeyEvent) event).getCode().equals(KeyCode.ENTER)) {
					return;
				}
			}
			
			
				User user = new User(txtUsername.getText(), pfPassword.getText());
				LoginProcess lp = new LoginProcess(user);
				lp.addEventHandler(WorkerStateEvent.WORKER_STATE_SUCCEEDED, new EventHandler<WorkerStateEvent>() {
					@Override
					public void handle(WorkerStateEvent t) {
						Boolean result = (Boolean) lp.getValue();
						if (result) {
							mainCon.setSession(new SessionInfos(user));
							mainCon.gotoOptions();
						} else {
							lblError.setVisible(true);
							lblError.setText("An Error Ocured! Username or Password is incorrect!");
						}
					}
				});
				new Thread(lp).start();
			}
	};
	
	@FXML
	void register(ActionEvent event) {
		mainCon.gotoRegister();
	}

	public LoginController(MainController mainController) {
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert txtUsername != null : "fx:id=\"txtUsername\" was not injected: check your FXML file 'Login.fxml'.";
		assert pfPassword != null : "fx:id=\"pfPassword\" was not injected: check your FXML file 'Login.fxml'.";
		assert lblError != null : "fx:id=\"lblError\" was not injected: check your FXML file 'Login.fxml'.";

		btnLogin.addEventHandler(ActionEvent.ANY, loginHandler);
		login_AnchorPane.addEventHandler(KeyEvent.KEY_PRESSED, loginHandler);
	}

}
