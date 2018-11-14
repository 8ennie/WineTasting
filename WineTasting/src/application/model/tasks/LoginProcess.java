package application.model.tasks;

import java.util.List;

import application.model.data.User;
import javafx.concurrent.Task;

public class LoginProcess extends Task<Boolean> {


	private final User user;

	@Override
	protected Boolean call() throws Exception {
		return verifyLogin();
	}

	public LoginProcess(User user) {
		this.user = user;
	}

	public boolean verifyLogin() {
		List<User> users = UserFileHandler.getUsers();
		for (User user : users) {
			if(this.user.isEqualTo(user)) {
				System.out.println("true");
				return true;
			}
		}
		return false;
	}

}
