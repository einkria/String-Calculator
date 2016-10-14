package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	//1
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}
	//2
	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}
	//3
	@Test
	public void testTwoNumbers(){
		assertEquals(3, Calculator.add("1,2"));
	}
	//4
	@Test
	public void testThreeNumbers(){
		assertEquals(6, Calculator.add("1,2,3"));
	}
	//5
	@Test
	public void testSixNumbers(){
		assertEquals(21, Calculator.add("1,2,3,4,5,6"));
	}
	//6
	@Test
	public void testNewLine(){
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	//7
	/*@Test
	public void testNegative(){
		assertEquals(1, Calculator.add("2,-4,3,-5"));
	}*/
	//8
	@Test
	public void testLarger(){
		assertEquals(2, Calculator.add("1001,2"));
	}
	//9
	@Test
	public void testLargerAgain(){
		assertEquals(4, Calculator.add("1,1001,2,2332,1,4000"));
	}
	//10
	@Test
	public void testDeliminator(){
		assertEquals(3, Calculator.add("//;\n1;2"));
	}
}    

