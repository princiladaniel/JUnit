import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void validString() {

		boolean reverseString = Solution.checkPalindrome("i am going good");
		System.out.println("Input:i am going good ~ Expected:false ~ Actual:" + reverseString);
		assertEquals(false, reverseString);

	}

}
