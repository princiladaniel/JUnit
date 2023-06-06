import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumTest1 {
	@Test(timeout = 3000)
	public void validTest() {
		boolean palindrome = Solution.isPalindrome(121);
		System.out.println("Input:121 ~ Expected:true ~ Actual:" + palindrome);
		assertEquals(true, palindrome);

	}
}
