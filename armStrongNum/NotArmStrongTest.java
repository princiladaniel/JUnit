package armStrongNum;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class NotArmStrongTest {
	@Test
	public void notarmStrongNumber() {
		boolean armNum =ArmstrongNumber.armNum(125);
		System.out.println("Input:123, Expected:False, Actual:"+armNum);
		assertFalse(armNum);
	}
}
