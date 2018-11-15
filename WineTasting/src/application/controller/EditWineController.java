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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 * @author student
 *
 */
public class EditWineController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="editWine_AnchorPane"
	private AnchorPane editWine_AnchorPane; // Value injected by FXMLLoader

	@FXML // fx:id="userName_Lable"
	private Label userName_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="logOut_Button"
	private Button logOut_Button; // Value injected by FXMLLoader

	@FXML // fx:id="standName_Lable"
	private Label standName_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="wines_ChoiceBox"
	private ChoiceBox<?> wines_ChoiceBox; // Value injected by FXMLLoader

	@FXML // fx:id="removeWine_Button"
	private Button removeWine_Button; // Value injected by FXMLLoader

	@FXML // fx:id="wineName_TextField"
	private TextField wineName_TextField; // Value injected by FXMLLoader

	@FXML // fx:id="addWine_Button"
	private Button addWine_Button; // Value injected by FXMLLoader

	@FXML // fx:id="finished_Button"
	private Button finished_Button; // Value injected by FXMLLoader

	private MainController mainCon;

	private Stand stand;

	public EditWineController(MainController mainController, Stand stand) {
		this.mainCon = mainController;
		this.stand = stand;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert editWine_AnchorPane != null : "fx:id=\"editWine_AnchorPane\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert userName_Lable != null : "fx:id=\"userName_Lable\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert logOut_Button != null : "fx:id=\"logOut_Button\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert standName_Lable != null : "fx:id=\"standName_Lable\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert wines_ChoiceBox != null : "fx:id=\"wines_ChoiceBox\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert removeWine_Button != null : "fx:id=\"removeWine_Button\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert wineName_TextField != null : "fx:id=\"wineName_TextField\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert addWine_Button != null : "fx:id=\"addWine_Button\" was not injected: check your FXML file 'EditWine.fxml'.";
		assert finished_Button != null : "fx:id=\"finished_Button\" was not injected: check your FXML file 'EditWine.fxml'.";

	}

	

}
