package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeTableColumn;

import javafx.fxml.Initializable;

public class SearchController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUserName"
	private Label lblUserName; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandNr"
	private TreeTableColumn<?, ?> tcStandNr; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandName"
	private TreeTableColumn<?, ?> tcStandName; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandLocation"
	private TreeTableColumn<?, ?> tcStandLocation; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandOwner"
	private TreeTableColumn<?, ?> tcStandOwner; // Value injected by FXMLLoader

	@FXML // fx:id="tcWineName"
	private TreeTableColumn<?, ?> tcWineName; // Value injected by FXMLLoader

	private MainController mainCon;

	public SearchController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert lblUserName != null : "fx:id=\"lblUserName\" was not injected: check your FXML file 'Search.fxml'.";
		assert tcStandNr != null : "fx:id=\"tcStandNr\" was not injected: check your FXML file 'Search.fxml'.";
		assert tcStandName != null : "fx:id=\"tcStandName\" was not injected: check your FXML file 'Search.fxml'.";
		assert tcStandLocation != null : "fx:id=\"tcStandLocation\" was not injected: check your FXML file 'Search.fxml'.";
		assert tcStandOwner != null : "fx:id=\"tcStandOwner\" was not injected: check your FXML file 'Search.fxml'.";
		assert tcWineName != null : "fx:id=\"tcWineName\" was not injected: check your FXML file 'Search.fxml'.";

	}

	@FXML
	void editStand(ActionEvent event) {

	}

	@FXML
	void goBack(ActionEvent event) {

	}

	@FXML
	void goToEvaluation(ActionEvent event) {

	}

	@FXML
	void logOut(ActionEvent event) {

	}

	@FXML
	void search(ActionEvent event) {

	}

	@FXML
	void txtSearch(ActionEvent event) {

	}

}
