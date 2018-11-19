package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Stand;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class StandsController implements Initializable {

	@FXML // fx:id="stands_AnchorPane"
	private AnchorPane stands_AnchorPane; // Value injected by FXMLLoader

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="userName_Lable"
	private Label userName_Lable; // Value injected by FXMLLoader

	@FXML // fx:id="logOut_Button"
	private Button logOut_Button; // Value injected by FXMLLoader

	@FXML // fx:id="back_Button"
	private Button back_Button; // Value injected by FXMLLoader

	@FXML // fx:id="removeStand_Button"
	private Button removeStand_Button; // Value injected by FXMLLoader

	@FXML // fx:id="editWines_Button"
	private Button editWines_Button; // Value injected by FXMLLoader

	@FXML // fx:id="addStand_Button"
	private Button addStand_Button; // Value injected by FXMLLoader

	@FXML // fx:id="search_Button"
	private Button search_Button; // Value injected by FXMLLoader

	@FXML // fx:id="stands_TableView"
	private TableView<Stand> stands_TableView; // Value injected by FXMLLoader

	@FXML // fx:id="standNr_TableColumn"
	private TableColumn<Stand, Integer> standNr_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standName_TableColumn"
	private TableColumn<Stand, String> standName_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standLocation_TableColumn"
	private TableColumn<Stand, String> standLocation_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standOwner_TableColumn"
	private TableColumn<Stand, String> standOwner_TableColumn; // Value injected by FXMLLoader

	private MainController mainCon;

	public StandsController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert stands_AnchorPane != null : "fx:id=\"stands_AnchorPane\" was not injected: check your FXML file 'Stands.fxml'.";
		assert userName_Lable != null : "fx:id=\"userName_Lable\" was not injected: check your FXML file 'Stands.fxml'.";
		assert logOut_Button != null : "fx:id=\"logOut_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert back_Button != null : "fx:id=\"back_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert removeStand_Button != null : "fx:id=\"removeStand_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert editWines_Button != null : "fx:id=\"editWines_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert addStand_Button != null : "fx:id=\"addStand_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert search_Button != null : "fx:id=\"search_Button\" was not injected: check your FXML file 'Stands.fxml'.";
		assert stands_TableView != null : "fx:id=\"stands_TableView\" was not injected: check your FXML file 'Stands.fxml'.";
		assert standNr_TableColumn != null : "fx:id=\"standNr_TableColumn\" was not injected: check your FXML file 'Stands.fxml'.";
		assert standName_TableColumn != null : "fx:id=\"standName_TableColumn\" was not injected: check your FXML file 'Stands.fxml'.";
		assert standLocation_TableColumn != null : "fx:id=\"standLocation_TableColumn\" was not injected: check your FXML file 'Stands.fxml'.";
		assert standOwner_TableColumn != null : "fx:id=\"standOwner_TableColumn\" was not injected: check your FXML file 'Stands.fxml'.";
		userName_Lable.setText(mainCon.getSession().getCurrentUser().getUsername());
		stands_TableView.setItems(mainCon.getSession().getStandList());
		standName_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandName());
		standNr_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandId().asObject());
		standLocation_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandLocation());
		standOwner_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandOwner());
		addStand_Button.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mainCon.gotoAddStand();
			}
		});
		back_Button.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mainCon.gotoOptions();
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
