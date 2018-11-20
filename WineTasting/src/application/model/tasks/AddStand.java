package application.model.tasks;

import java.io.IOException;

import application.model.data.Stand;
import javafx.concurrent.Task;

public class AddStand extends Task<Boolean>{	
	private final Stand stand;
	
	public AddStand(Stand stand) {
		this.stand = stand;
	}
	
	private boolean writeToFile(){
		try{
			StandFileHandler.persistStand(this.stand);
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
