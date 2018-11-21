/**
 * 
 */
package application.model.tasks;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import application.controller.MainController;
import application.model.data.SessionInfos;
import application.model.data.User;
import application.model.data.UserDAO;
import javafx.stage.Stage;

import static org.mockito.Mockito.*;

/**
 * @author student
 *
 */
public class LoginProcessTest {

	LoginProcess loginProcess;
	Stage mockedStage;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		mockedStage = mock(Stage.class);
		
	}

	/**
	 * Test method for {@link application.model.tasks.LoginProcess#LoginProcess(application.model.data.User, application.controller.MainController)}.
	 */
	@Test
	public void testLoginProcessSessionUser() {
		MainController mainController = new MainController(mockedStage);
		User user = new User("name", "pw" );
		loginProcess = new LoginProcess(user, mainController);
		SessionInfos sessionInfos = new SessionInfos(user);
		sessionInfos.setStandList(StandFileHandler.getStand());
		sessionInfos.setWineList(WineFileHander.getWine());
		
		try {
			loginProcess.call();
			assertEquals(sessionInfos.getCurrentUser(), mainController.getSession().getCurrentUser());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link application.model.tasks.LoginProcess#LoginProcess(application.model.data.User, application.controller.MainController)}.
	 */
	@Test
	public void testLoginProcessSessionStaende() {
		MainController mainController = new MainController(mockedStage);
		User user = new User("name", "pw" );
		loginProcess = new LoginProcess(user, mainController);
		SessionInfos sessionInfos = new SessionInfos(user);
		sessionInfos.setStandList(StandFileHandler.getStand());
		sessionInfos.setWineList(WineFileHander.getWine());
		
		try {
			loginProcess.call();
			assertEquals(sessionInfos.getStandList(), mainController.getSession().getStandList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Test method for {@link application.model.tasks.LoginProcess#LoginProcess(application.model.data.User, application.controller.MainController)}.
	 */
	@Test
	public void testLoginProcessSessionWines() {
		MainController mainController = new MainController(mockedStage);
		User user = new User("name", "pw" );
		loginProcess = new LoginProcess(user, mainController);
		SessionInfos sessionInfos = new SessionInfos(user);
		sessionInfos.setStandList(StandFileHandler.getStand());
		sessionInfos.setWineList(WineFileHander.getWine());
		
		try {
			loginProcess.call();
			assertEquals(sessionInfos.getWineList(), mainController.getSession().getWineList());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link application.model.tasks.LoginProcess#verifyLogin()}.
	 */
	@Test
	public void testVerifyLoginFalse() {
		loginProcess = new LoginProcess(new User("name", "pw" ), new MainController(mockedStage));
		assertEquals(false, loginProcess.verifyLogin());
	}
	@Test
	public void testVerifyLoginTrue() {
		loginProcess = new LoginProcess(new User("asd", "123" ), new MainController(mockedStage));
		assertEquals(true, loginProcess.verifyLogin());
	}

}
