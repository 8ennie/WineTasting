/**
 * 
 */
package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Wine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;

/**
 * @author student
 *
 */
public class EvaluationController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUsername"
	private Label lblUsername; // Value injected by FXMLLoader

	@FXML // fx:id="lblStandName"
	private Label lblStandName; // Value injected by FXMLLoader

	@FXML // fx:id="cbWines"
	private ChoiceBox<Wine> cbWines; // Value injected by FXMLLoader

	@FXML // fx:id="sliderSweet"
	private Slider sliderSweet; // Value injected by FXMLLoader

	@FXML // fx:id="sliderSalty"
	private Slider sliderSalty; // Value injected by FXMLLoader

	@FXML // fx:id="sliderBitter"
	private Slider sliderBitter; // Value injected by FXMLLoader

	@FXML // fx:id="sliderSour"
	private Slider sliderSour; // Value injected by FXMLLoader

	@FXML // fx:id="txtReview"
	private TextArea txtReview; // Value injected by FXMLLoader

	private MainController mainCon;

	public EvaluationController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert lblUsername != null : "fx:id=\"lblUsername\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert lblStandName != null : "fx:id=\"lblStandName\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert cbWines != null : "fx:id=\"cbWines\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert sliderSweet != null : "fx:id=\"sliderSweet\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert sliderSalty != null : "fx:id=\"sliderSalty\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert sliderBitter != null : "fx:id=\"sliderBitter\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert sliderSour != null : "fx:id=\"sliderSour\" was not injected: check your FXML file 'Evaluate.fxml'.";
		assert txtReview != null : "fx:id=\"txtReview\" was not injected: check your FXML file 'Evaluate.fxml'.";

	}

	@FXML
	void evaluateWine(ActionEvent event) {

	}

	@FXML
	void goBack(ActionEvent event) {
		mainCon.gotoOptions();
	}

	@FXML
	void logOut(ActionEvent event) {
		mainCon.logOut();
	}

}
