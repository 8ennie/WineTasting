package application.controller;

/**
 * Sample Skeleton for 'Options.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class OptionsController implements Initializable{

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="userNameLabel"
    private Label userNameLabel; // Value injected by FXMLLoader

	private final MainController mainCon;

    public OptionsController(MainController mainController) {
    	this.mainCon = mainController;
    }

	@FXML
    void edit(ActionEvent event) {

    }

    @FXML
    void evaluate(ActionEvent event) {

    }

    @FXML
    void logOut(ActionEvent event) {

    }

    @FXML
    void viewEvaluation(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert userNameLabel != null : "fx:id=\"userNameLabel\" was not injected: check your FXML file 'Options.fxml'.";
	}
}
