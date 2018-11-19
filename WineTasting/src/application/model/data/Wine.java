package application.model.data;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Wine {

	private IntegerProperty wineId;
	private StringProperty name;
	private StringProperty description;
	private IntegerProperty standId;

	public Wine(int wineId, String name, String description, int standId) {
		this.wineId = new SimpleIntegerProperty(wineId);
		this.name = new SimpleStringProperty(name);
		this.description = new SimpleStringProperty(description);
		this.standId = new SimpleIntegerProperty(standId);
	}

	public IntegerProperty getWineId() {
		return wineId;
	}

	public StringProperty getName() {
		return name;
	}

	public StringProperty getDescription() {
		return description;
	}

	public IntegerProperty getStandId() {
		return standId;
	}

	public void setWineId(IntegerProperty wineId) {
		this.wineId = wineId;
	}

	public void setName(StringProperty name) {
		this.name = name;
	}

	public void setDescription(StringProperty description) {
		this.description = description;
	}

	public void setStandId(IntegerProperty standId) {
		this.standId = standId;
	}

}
