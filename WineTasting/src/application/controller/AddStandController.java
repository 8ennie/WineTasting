/**
 * 
 */
package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Stand;
import application.model.tasks.AddStand;
import application.model.tasks.CsvFileWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author bcwie
 *
 */
public class AddStandController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUsername"
	private Label lblUsername; // Value injected by FXMLLoader

	@FXML // fx:id="txtStandOwner"
	private TextField txtStandOwner; // Value injected by FXMLLoader

	@FXML // fx:id="txtStandName"
	private TextField txtStandName; // Value injected by FXMLLoader

	@FXML // fx:id="txtStandLocation"
	private TextField txtStandLocation; // Value injected by FXMLLoader

	private MainController mainCon;

	public AddStandController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'AddStand.fxml'.";
		assert txtStandOwner != null : "fx:id=\"txtStandOwner\" was not injected: check your FXML file 'AddStand.fxml'.";
		assert txtStandName != null : "fx:id=\"txtStandName\" was not injected: check your FXML file 'AddStand.fxml'.";
		assert txtStandLocation != null : "fx:id=\"txtStandLocation\" was not injected: check your FXML file 'AddStand.fxml'.";
		
	}

	@FXML
	void addStand(ActionEvent event) {
		try {
			Stand newStand = new Stand(txtStandName.getText(), txtStandLocation.getText(), txtStandOwner.getText());
			new AddStand(newStand);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@FXML
	void logOut(ActionEvent event) {
		mainCon.logOut();
	}

}
