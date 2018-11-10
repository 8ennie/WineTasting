package example.controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

	 private Stage stage; 
	 
	 public MainController(Stage stage){
		 this.stage = stage;
	 }
	 
	 public void gotoLogin() {
	        try {
	             this.replaceSceneContent("/view/Login.fxml", new LoginController(this));
	            
	        } catch (Exception ex) {
	            System.out.println("Login: "+ex.getMessage());
	        }
	    }

	    private void replaceSceneContent(String fxmlPath, Initializable controller ) throws Exception {
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource(fxmlPath));  
		    loader.setController(controller);
		    Parent root = loader.load();
		    Scene scene = new Scene(root);
		    stage.setScene(scene);
		    // Show the GUI
		    stage.show();
	    }
	    
	    public void gotoNextScene(String fxmlPath, Initializable controller) {
	        try {
	            this.replaceSceneContent(fxmlPath, controller);
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	    }
	    
	 
	 
}
