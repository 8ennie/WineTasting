/**
 * 
 */
package application.model.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @author student
 *
 */
public class SessionInfos {

	private final User currentUser;

	private ObservableList<Stand> standList = FXCollections.observableArrayList();

	/**
	 * 
	 */
	public SessionInfos(User currentUser) {
		this.currentUser = currentUser;
	}

	public User getCurrentUser() {
		return currentUser;
	}

	public ObservableList<Stand> getStandList() {
		return standList;
	}

	public void setStandList(ObservableList<Stand> standList) {
		this.standList = standList;
	}
}
