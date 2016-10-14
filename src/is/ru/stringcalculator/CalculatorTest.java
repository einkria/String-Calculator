package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testThreeNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}
	
	@Test
	public void testSixNumbers(){
		assertEquals(21, Calculator.add("1,2,3,4,5,6"));
	}
	
	@Test
	public void testNewLine(){
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	
	/*@Test
	public void testNegative(){
		assertEquals(1, Calculator.add("2,-4,3,-5"));
	}*/
	
	@Test
	public void testLarger(){
		assertEquals(2, Calculator.add("1001,2"));
	}
	
	@Test
	public void testLargerAgain(){
		assertEquals(4, Calculator.add("1,1001,2,2332,1,4000"));
	}
}    

