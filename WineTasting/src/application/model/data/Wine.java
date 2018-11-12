package application.model.data;

public class Wine {

	private int wineId;
	private String name;
	private String description;
	private int standId;
	
	public Wine(int wineId, String name, String description, int standId) {
		this.wineId = wineId;
		this.name = name;
		this.description = description;
		this.standId = standId;
	}
	
	public int getWineId() {
		return wineId;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getStandId() {
		return standId;
	}
	public void setWineId(int wineId) {
		this.wineId = wineId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStandId(int standId) {
		this.standId = standId;
	}
	
	
}
