package application.model.tasks;

import java.io.IOException;

import application.model.data.Wine;
import javafx.concurrent.Task;

public class AddWine extends Task<Boolean> {

	private final Wine wine;

	public AddWine(Wine wine) {
		this.wine = wine;
	}

	private boolean writeToFile() {
		try {
			WineFileHander.persistWine(this.wine);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	protected Boolean call() throws Exception {
		return this.writeToFile();
	}

}
