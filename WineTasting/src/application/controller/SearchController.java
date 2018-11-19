package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.data.Stand;
import application.model.data.Wine;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SearchController implements Initializable {

	@FXML // fx:id="search_AnchorPane"
	private AnchorPane search_AnchorPane; // Value injected by FXMLLoader

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

	@FXML // fx:id="search_TextField"
	private TextField search_TextField; // Value injected by FXMLLoader

	@FXML // fx:id="search_Button"
	private Button search_Button; // Value injected by FXMLLoader

	@FXML // fx:id="result_TableView"
	private TableView<Wine> result_TableView; // Value injected by FXMLLoader

	@FXML // fx:id="standNr_TableColumn"
	private TableColumn<Stand, Integer> standNr_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standName_TableColumn"
	private TableColumn<Stand, String> standName_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standLocation_TableColumn"
	private TableColumn<Stand, String> standLocation_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="standOwner_TableColumn"
	private TableColumn<Stand, String> standOwner_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="wineName_TableColumn"
	private TableColumn<Wine, String> wineName_TableColumn; // Value injected by FXMLLoader

	@FXML // fx:id="evaluation_Button"
	private Button evaluation_Button; // Value injected by FXMLLoader

	@FXML // fx:id="editStand_Button"
	private Button editStand_Button; // Value injected by FXMLLoader

	private MainController mainCon;

	public SearchController(MainController mainController) {
		// TODO Auto-generated constructor stub
		this.mainCon = mainController;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert search_AnchorPane != null : "fx:id=\"search_AnchorPane\" was not injected: check your FXML file 'Search.fxml'.";
		assert userName_Lable != null : "fx:id=\"userName_Lable\" was not injected: check your FXML file 'Search.fxml'.";
		assert logOut_Button != null : "fx:id=\"logOut_Button\" was not injected: check your FXML file 'Search.fxml'.";
		assert back_Button != null : "fx:id=\"back_Button\" was not injected: check your FXML file 'Search.fxml'.";
		assert search_TextField != null : "fx:id=\"search_TextField\" was not injected: check your FXML file 'Search.fxml'.";
		assert search_Button != null : "fx:id=\"search_Button\" was not injected: check your FXML file 'Search.fxml'.";
		assert result_TableView != null : "fx:id=\"result_TableView\" was not injected: check your FXML file 'Search.fxml'.";
		assert standNr_TableColumn != null : "fx:id=\"standNr_TableColumn\" was not injected: check your FXML file 'Search.fxml'.";
		assert standName_TableColumn != null : "fx:id=\"standName_TableColumn\" was not injected: check your FXML file 'Search.fxml'.";
		assert standLocation_TableColumn != null : "fx:id=\"standLocation_TableColumn\" was not injected: check your FXML file 'Search.fxml'.";
		assert standOwner_TableColumn != null : "fx:id=\"standOwner_TableColumn\" was not injected: check your FXML file 'Search.fxml'.";
		assert wineName_TableColumn != null : "fx:id=\"wineName_TableColumn\" was not injected: check your FXML file 'Search.fxml'.";
		assert evaluation_Button != null : "fx:id=\"evaluation_Button\" was not injected: check your FXML file 'Search.fxml'.";
		assert editStand_Button != null : "fx:id=\"editStand_Button\" was not injected: check your FXML file 'Search.fxml'.";
		
		userName_Lable.setText(mainCon.getSession().getCurrentUser().getUsername());
		result_TableView.setItems(mainCon.getSession().getWineList());
		standName_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandName());
		standNr_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandId().asObject());
		standLocation_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandLocation());
		standOwner_TableColumn.setCellValueFactory(cellData -> cellData.getValue().getStandOwner());
		
		
		
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
		editStand_Button.addEventFilter(ActionEvent.ANY, new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				mainCon.gotoStands();
			}
		});
	}

}
