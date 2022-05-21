package junitTestCase;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactOfNumber {
	@Test
	public void factOfNnumber() {
		
		for (int i = 1; i <= 5; i++) {
		
		System.out.println("Input:5, Expected:120, Actual:"+Factorial.fact(i));
			assertEquals(i * Factorial.fact(i - 1), Factorial.fact(i));	
		}
	}
	
}
