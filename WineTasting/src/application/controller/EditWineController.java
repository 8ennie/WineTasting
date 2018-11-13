/**
 * 
 */
package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Stand;
import application.model.data.Wine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * @author student
 *
 */
public class EditWineController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUsername"
	private Label lblUsername; // Value injected by FXMLLoader

	@FXML // fx:id="standName"
	private Label lblStandName; // Value injected by FXMLLoader

	@FXML // fx:id="txtWineName"
	private TextField txtWineName; // Value injected by FXMLLoader

	@FXML // fx:id="cbWines"
	private ChoiceBox<Wine> cbWines; // Value injected by FXMLLoader

	private MainController mainCon;
	
	private Stand stand;

	public EditWineController(MainController mainController, Stand stand) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
		this.stand = stand;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert lblStandName != null : "fx:id=\"standName\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert txtWineName != null : "fx:id=\"txtWineName\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert cbWines != null : "fx:id=\"cbWines\" was not injected: check your FXML file 'EditWine.fxml'.";

	}

	@FXML
	void addWine(ActionEvent event) {

	}

	@FXML
	void finished(ActionEvent event) {

	}

	@FXML
	void logOut(ActionEvent event) {
		mainCon.logOut();
	}

	@FXML
	void removeWine(ActionEvent event) {

	}

}
