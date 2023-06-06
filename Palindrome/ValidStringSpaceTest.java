import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidStringSpaceTest {
	@Test
	public void validStringSpace() {

		boolean reverseString = Solution.checkPalindrome(" ");
		System.out.println("Input:" + " " + " ~ Expected:true ~ Actual:" + reverseString);
		assertEquals(true, reverseString);

	}

}
