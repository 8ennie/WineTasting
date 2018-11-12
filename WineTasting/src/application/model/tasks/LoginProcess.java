package application.model.tasks;

import java.util.List;

import application.model.data.User;
import javafx.concurrent.Task;

public class LoginProcess extends Task<Object> {

	private String userName;
	private String password;

	@Override
	protected Object call() throws Exception {
		new ReaderTxt().read();
		return verifyLogin();
	}

	public LoginProcess(User user) {
		userName = user.getUsername();
		password = user.getPassword();
	}

	public boolean verifyLogin() {
		List<User> uList = User.getUserList();
		for (User user : uList) {
			if (user.getUsername().equals(this.userName) && user.getPassword().equals(this.password)) {
				User.setCurUser(user);
				return true;
			}
		}
		return false;

	}

}
