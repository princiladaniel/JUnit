import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReverseTest1 {
	@Test(timeout = 3000)
	public void validTest1() {
		int reverse = Solution.reverse(231);
		System.out.println("Input:231 ~ Expected:132 ~ Actual:" + reverse);
		assertEquals(132, reverse);
	}
}
