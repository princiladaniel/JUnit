import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTwoIntegersTest1 {
	@Test(timeout = 3000)
	public void valildTest() {
		int output = Solution.divide(10, 3);
		System.out.println("Input:10, 3 ~ Expected:3 ~ Actual:" + output);
		assertEquals(3, output);
	}

}
