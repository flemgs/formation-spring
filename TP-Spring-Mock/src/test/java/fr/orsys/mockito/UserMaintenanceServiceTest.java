package fr.orsys.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringAnnotationConfigTest.class)
public class UserMaintenanceServiceTest {

	@InjectMocks
	private UserMaintenanceService userMaintenanceService;
	
	@Mock
	private UserDao userDao;
	
	@Before
	public void setup() {
		
	}
	
	@Test
	public void serviceTest() {
		initMocks(this);
		when(userDao.findUserById(1000L)).thenReturn(getMyTestUser());
		assertNotNull(userMaintenanceService.findUserById(1000L));
		assertEquals(999, userMaintenanceService.findUserById(1000L).getUserId());
	}
	
	public User getMyTestUser() {
		User user = new User();
		user.setFirstName("coucou");
		user.setSurname("coucou");
		user.setUserId(999);
		user.setDateOfBirth(new Date());
		return user;
	}
}
