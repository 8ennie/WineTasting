package application.model.tasks;

import java.io.IOException;

import application.model.data.User;
import javafx.concurrent.Task;

public class RegisterUser extends Task<Boolean>{

	private final User user;

	public RegisterUser(User user){
		this.user = user;
	}

	private boolean writeToFile(){
		try{
			UserFileHandler.persistUser(this.user);
		} catch (IOException e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	protected Boolean call() throws Exception{
		return this.writeToFile();
	}
}
