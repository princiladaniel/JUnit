package sumOfDigit;

import static org.testng.Assert.assertTrue;

import org.junit.Test;

public class ArmStrongNumberTest {
	@Test
	public void armStrongNumber() {
		boolean armNum =ArmstrongNumber.armNum(153);
		System.out.println("Input:153, Expected:True, Actual:"+armNum);
		assertTrue(armNum);
		
}
}
