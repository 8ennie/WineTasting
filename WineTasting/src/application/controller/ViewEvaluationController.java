package application.controller;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class ViewEvaluationController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="viewEvaluation_AnchorPane"
	private AnchorPane viewEvaluation_AnchorPane; // Value injected by FXMLLoader

	@FXML // fx:id="userName_Lable"
	private Label userName_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="logOut_Button"
	private Button logOut_Button; // Value injected by FXMLLoader

	@FXML // fx:id="goBack_Button"
	private Button goBack_Button; // Value injected by FXMLLoader

	@FXML // fx:id="standName_Lable"
	private Label standName_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="wines_ChoiceBox"
	private ChoiceBox<?> wines_ChoiceBox; // Value injected by FXMLLoader

	@FXML // fx:id="sweet_Lable"
	private Label sweet_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="salty_Lable"
	private Label salty_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="bitter_Lable"
	private Label bitter_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="sour_Lable"
	private Label sour_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="standRieview_Lable"
	private Label standRieview_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="finished_Button"
	private Button finished_Button; // Value injected by FXMLLoader

	private MainController mainCon;

	public ViewEvaluationController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert viewEvaluation_AnchorPane != null : "fx:id=\"viewEvaluation_AnchorPane\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert userName_Lable != null : "fx:id=\"userName_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert logOut_Button != null : "fx:id=\"logOut_Button\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert goBack_Button != null : "fx:id=\"goBack_Button\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert standName_Lable != null : "fx:id=\"standName_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert wines_ChoiceBox != null : "fx:id=\"wines_ChoiceBox\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert sweet_Lable != null : "fx:id=\"sweet_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert salty_Lable != null : "fx:id=\"salty_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert bitter_Lable != null : "fx:id=\"bitter_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert sour_Lable != null : "fx:id=\"sour_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert standRieview_Lable != null : "fx:id=\"standRieview_Lable\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		assert finished_Button != null : "fx:id=\"finished_Button\" was not injected: check your FXML file 'ViewEvaluation.fxml'.";
		userName_Lable.setText(mainCon.getSession().getCurrentUser().getUsername());
		finished_Button.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mainCon.gotoSearch();
			}
		});
		logOut_Button.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mainCon.logOut();
			}
		});
	}

	
}
