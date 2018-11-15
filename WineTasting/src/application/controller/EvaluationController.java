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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

/**
 * @author student
 *
 */
public class EvaluationController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="evaluate_AnchorPane"
	private AnchorPane evaluate_AnchorPane; // Value injected by FXMLLoader

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

	@FXML // fx:id="sweet_Slider"
	private Slider sweet_Slider; // Value injected by FXMLLoader

	@FXML // fx:id="salty_Slider"
	private Slider salty_Slider; // Value injected by FXMLLoader

	@FXML // fx:id="bitter_Slider"
	private Slider bitter_Slider; // Value injected by FXMLLoader

	@FXML // fx:id="sour_Slider"
	private Slider sour_Slider; // Value injected by FXMLLoader

	@FXML // fx:id="review_TextArea"
	private TextArea review_TextArea; // Value injected by FXMLLoader

	@FXML // fx:id="evaluateWine_Button"
	private Button evaluateWine_Button; // Value injected by FXMLLoader

	private MainController mainCon;

	public EvaluationController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert evaluate_AnchorPane != null : "fx:id=\"evaluate_AnchorPane\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert userName_Lable != null : "fx:id=\"userName_Lable\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert logOut_Button != null : "fx:id=\"logOut_Button\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert goBack_Button != null : "fx:id=\"goBack_Button\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert standName_Lable != null : "fx:id=\"standName_Lable\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert wines_ChoiceBox != null : "fx:id=\"wines_ChoiceBox\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert sweet_Slider != null : "fx:id=\"sweet_Slider\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert salty_Slider != null : "fx:id=\"salty_Slider\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert bitter_Slider != null : "fx:id=\"bitter_Slider\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert sour_Slider != null : "fx:id=\"sour_Slider\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert review_TextArea != null : "fx:id=\"review_TextArea\" was not injected: check your FXML file 'Evaluate.fxml'.";
        assert evaluateWine_Button != null : "fx:id=\"evaluateWine_Button\" was not injected: check your FXML file 'Evaluate.fxml'.";

	}

	

}
