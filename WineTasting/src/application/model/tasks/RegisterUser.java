package application.model.tasks;

import java.io.FileWriter;

import application.model.data.User;
import javafx.concurrent.Task;

public class RegisterUser extends Task<Object> {

	private final String userName;
	private final String password;

	@Override
	protected Object call() throws Exception {
		return writeToFile();
	}

	public RegisterUser(User user) {
		this.userName = user.getUsername();
		this.password = user.getPassword();
	}

	private boolean writeToFile() {
		try {
			FileWriter fwrite = new FileWriter("C:\\Users\\bcwie\\git\\WineTasting\\WineTasting\\src\\application\\model\\UserList.txt",true);
			String write = "\n" + userName + ":" + password  ;
			fwrite.write(write);
			fwrite.close();
			System.out.println("Success");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occured.");
			return false;
		}

	}
}
