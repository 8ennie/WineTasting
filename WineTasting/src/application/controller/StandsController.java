package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Stand;
import application.model.tasks.CsvFileReader;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class StandsController implements Initializable {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="lblUserName"
	private Label lblUserName; // Value injected by FXMLLoader

	@FXML // fx:id="tvStands"
	private TableView<Stand> tvStands = new TableView<Stand>(); // Value injected by FXMLLoader

	@FXML // fx:id="tcStandNr"
	private TableColumn<Stand, Integer> tcStandNr; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandName"
	private TableColumn<Stand, String> tcStandName; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandLocation"
	private TableColumn<Stand, String> tcStandLocation; // Value injected by FXMLLoader

	@FXML // fx:id="tcStandOwner"
	private TableColumn<Stand, String> tcStandOwner; // Value injected by FXMLLoader

	private MainController mainCon;

	public StandsController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
		tvStands.setItems(Stand.getStandList());
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert lblUserName != null : "fx:id=\"lblUserName\" was not injected: check your FXML file 'Stands.fxml'.";
		assert tvStands != null : "fx:id=\"tvStands\" was not injected: check your FXML file 'Stands.fxml'.";
		assert tcStandNr != null : "fx:id=\"tcStandNr\" was not injected: check your FXML file 'Stands.fxml'.";
		assert tcStandName != null : "fx:id=\"tcStandName\" was not injected: check your FXML file 'Stands.fxml'.";
		assert tcStandLocation != null : "fx:id=\"tcStandLocation\" was not injected: check your FXML file 'Stands.fxml'.";
		assert tcStandOwner != null : "fx:id=\"tcStandOwner\" was not injected: check your FXML file 'Stands.fxml'.";
		tcStandName.setCellValueFactory(cellData -> cellData.getValue().getStandName());
		tcStandNr.setCellValueFactory(cellData -> cellData.getValue().getStandId().asObject());
		tcStandLocation.setCellValueFactory(cellData -> cellData.getValue().getStandLocation());
		tcStandOwner.setCellValueFactory(cellData -> cellData.getValue().getStandOwner());
		
	}

	void setUp() {
		
	}
	
	@FXML
	void addStand(ActionEvent event) {

	}

	@FXML
	void editWines(ActionEvent event) {
		mainCon.gotoEditWine(null);
	}

	@FXML
	void goBack(ActionEvent event) {
		mainCon.gotoOptions();
	}

	@FXML
	void logOut(ActionEvent event) {
		mainCon.logOut();
	}

	@FXML
	void removeStand(ActionEvent event) {

	}

	@FXML
	void searchStand(ActionEvent event) {

	}

}
