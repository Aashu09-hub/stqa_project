package programminghub;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void testAdd() {
		Calculator calculator=new Calculator();
		int result=calculator.add(300,200);
		assertEquals(500,result);
	}


}
