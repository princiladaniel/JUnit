import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumTest4 {
	@Test(timeout = 3000)
	public void validTest() {
		boolean palindrome = Solution.isPalindrome(1001);
		System.out.println("Input:1001 ~ Expected:true ~ Actual:" + palindrome);
		assertEquals(true, palindrome);

	}
}
