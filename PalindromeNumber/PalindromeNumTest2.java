import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumTest2 {
	@Test(timeout = 3000)
	public void validTest() {
		boolean palindrome = Solution.isPalindrome(-121);
		System.out.println("Input:-121 ~ Expected:false ~ Actual:" + palindrome);
		assertEquals(false, palindrome);

	}
}
