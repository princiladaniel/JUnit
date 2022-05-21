package junitTestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactOfZeroTest {
	@Test
	public void factOfZeroToOne() {
		System.out.println("Input:0, Expected:1, Actual:"+Factorial.fact(0));
		
		assertEquals(1, Factorial.fact(0));
	}

}
