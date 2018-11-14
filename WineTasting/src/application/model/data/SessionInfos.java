/**
 * 
 */
package application.model.data;

/**
 * @author student
 *
 */
public class SessionInfos {
	
	private final User currentUser;
	/**
	 * 
	 */
	public SessionInfos(User currentUser) {
		this.currentUser = currentUser;
	}
	
	public User getCurrentUser() {
		return currentUser;
	}

}
