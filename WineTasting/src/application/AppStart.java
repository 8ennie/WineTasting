package application;

import application.controller.MainController;
import application.model.data.Stand;
import application.model.tasks.AddStand;
import javafx.application.Application;
import javafx.stage.Stage;

public class AppStart extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		AddStand stand1 = new AddStand(new Stand(1,"Test","1A","Horst"));
		AddStand stand2 = new AddStand(new Stand(2,"Test123","1B","asd"));
		Stand.addStandList(new Stand(2,"Test123","1B","asd"));
		new Thread(stand1).start(); 
		MainController mainController = new MainController(stage);
		mainController.gotoLogin();
		
		
		
	}

}
