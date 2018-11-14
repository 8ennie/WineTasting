package application.model.tasks;

import application.model.data.Stand;
import javafx.concurrent.Task;

public class AddStand extends Task<Object>{

	private final Stand newStand;
	private final String standName;
	private final String standLocation;
	private final String standOwner;
	
	
	
	
	public AddStand(Stand stand) {
		this.newStand = stand;
		this.standName = stand.getStandName().get();
		this.standLocation = stand.getStandLocation().get();
		this.standOwner = stand.getStandOwner().get();
		Stand.addStandList(stand);
	}

	public boolean saveStand() {
		try {
			CsvFileWriter.writeStandToCsvFile("./src/application/model/data/Stand.csv", newStand);
			CsvFileReader.readCsvFile("./src/application/model/data/Stand.csv");
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}


	@Override
	protected Object call() throws Exception {
		// TODO Auto-generated method stub
		return saveStand();
	}

}
