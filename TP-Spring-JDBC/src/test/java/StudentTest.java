import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.orsys.jdbc.AppConfig;
import fr.orsys.jdbc.StudentJDBCTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class StudentTest {
	
	@Autowired
	StudentJDBCTemplate studentJDBCTemplate;

	@Test
	public void studentTest() {
		assertNotNull(studentJDBCTemplate.getStudent(16));
	}
}
