package application.model.tasks;

import java.sql.SQLException;
import java.util.List;

import application.controller.LoginController;
import application.controller.MainController;
import application.model.data.SessionInfos;
import application.model.data.User;
import application.model.data.UserDAO;
import javafx.concurrent.Task;

public class LoginProcess extends Task<Boolean> {


	private final User user;
	private final MainController mainCon;

	@Override
	protected Boolean call() throws Exception {
		if(verifyLogin()) {
			login();
			return true;
		}else{
			return false;
		}
	}

	public LoginProcess(User user, MainController mainCon) {
		this.user = user;
		this.mainCon = mainCon;
	}

	public boolean verifyLogin() {
		UserDAO userDAO = new UserDAO(); 
		List<User> users = null;
		try {
			users = userDAO.getUserByName(this.user.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (User user : users) {
			if(this.user.isEqualTo(user)) {
				return true;
			}
		}
		return false;
	}

	private void login() {
		try {
			SessionInfos sInf = new SessionInfos(this.user);
			this.mainCon.setSession(sInf);
			sInf.setStandList(StandFileHandler.getStand());
			sInf.setWineList(WineFileHander.getWine());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
