package junitTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class NotPrimeTest {
	@Test
	public void validPrimeNumber() {
		boolean prime = PrimeNumber.prime(15);
		System.out.println("Input:15, Expected Output:false, Actual Output:"+prime);
		assertFalse(prime);
	}
}
