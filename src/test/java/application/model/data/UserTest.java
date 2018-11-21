package application.model.data;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsEqualToTrue() {
		User user = new User("noah", "123");
		assertEquals(true, user.isEqualTo(new User("noah", "123")));
	}

	@Test
	public void testIsEqualToFalse() {
		User user = new User("noah", "123");
		assertFalse(user.isEqualTo(new User("nh", "123")));
	}
}
