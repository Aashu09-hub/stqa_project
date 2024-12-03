package programminghub;

import static org.junit.Assert.*;

import org.junit.Test;

public class MulTest {

	@Test
	public void testMul() {
		Calculator calculator=new Calculator();
		int result=calculator.mul(30,20);
		assertEquals(600,result);
	}

}
