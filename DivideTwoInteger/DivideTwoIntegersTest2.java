import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTwoIntegersTest2 {
	@Test(timeout = 3000)
	public void valildTest() {
		int output = Solution.divide(0, 7);
		System.out.println("Input:0, 7 ~ Expected:0 ~ Actual:" + output);
		assertEquals(0, output);
	}

}
