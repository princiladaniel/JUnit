import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DivideTwoIntegersTest3 {
	@Test(timeout = 3000)
	public void valildTest() {
		int output = Solution.divide(7, -3);
		System.out.println("Input:7,-3 ~ Expected:-2 ~ Actual:" + output);
		assertEquals(-2, output);
	}

}
