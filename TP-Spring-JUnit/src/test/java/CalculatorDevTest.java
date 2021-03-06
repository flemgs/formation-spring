import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.orsys.interfaces.Calculator;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpringAnnotationConfig.class)
@ActiveProfiles("dev")
public class CalculatorDevTest {
	
	@Autowired
	@Qualifier("calc1")
	private Calculator calculatorMult;
	
	@Autowired
	@Qualifier("calc3")
	private Calculator calculatorSub;

	@Test
	public void calculateTest() {
		int a = 3;
		int b = 4;
		assertEquals(12, calculatorMult.calculate(a, b));
		assertEquals(-1, calculatorSub.calculate(a, b));
	}
}
