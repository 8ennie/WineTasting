/**
 * 
 */
package application.model.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author student
 *
 */
public class User {
	
	private static List<User> userList = new ArrayList<User>();
	
	private static User curUser;
	
	private String username;
	private String password;
	
	
	
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public static List<User> getUserList() {
		return userList;
	}
	public static User getCurUser() {
		return curUser;
	}
	public static void setCurUser(User curUser) {
		User.curUser = curUser;
	}
	public static void setUserList(List<User> userList) {
		User.userList = userList;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void addUser(User user) {
		User.userList.add(user);
	}
	
	
	
	
}
