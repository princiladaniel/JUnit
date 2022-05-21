package junitTestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactOfOneTest {
	@Test
	public void factOfOneTest() {
		
		System.out.println("Input:1, Expected:1, Actual:"+Factorial.fact(1));
		assertEquals(1, Factorial.fact(1));

	}
}
