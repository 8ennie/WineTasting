package application.controller;

import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class ViewEvaluationController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUserName"
	private Label lblUserName; // Value injected by FXMLLoader

	@FXML // fx:id="lblSweet"
	private Label lblSweet; // Value injected by FXMLLoader

	@FXML // fx:id="lblSalty"
	private Label lblSalty; // Value injected by FXMLLoader

	@FXML // fx:id="lblBitter"
	private Label lblBitter; // Value injected by FXMLLoader

	@FXML // fx:id="lblSour"
	private Label lblSour; // Value injected by FXMLLoader

	@FXML // fx:id="lblStandReview"
	private Label lblStandReview; // Value injected by FXMLLoader

	private MainController mainCon;

	public ViewEvaluationController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert lblUserName != null : "fx:id=\"lblUserName\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert lblSweet != null : "fx:id=\"lblSweet\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert lblSalty != null : "fx:id=\"lblSalty\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert lblBitter != null : "fx:id=\"lblBitter\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert lblSour != null : "fx:id=\"lblSour\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert lblStandReview != null : "fx:id=\"lblStandReview\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";

	}

	@FXML
	void finished(ActionEvent event) {

	}

	@FXML
	void goBack(ActionEvent event) {

	}

	@FXML
	void logOut(ActionEvent event) {
		mainCon.logOut();
	}
}
