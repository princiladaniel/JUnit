import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumTest3 {
	@Test(timeout = 3000)
	public void validTest() {
		boolean palindrome = Solution.isPalindrome(10);
		System.out.println("Input:10 ~ Expected:false ~ Actual:" + palindrome);
		assertEquals(false, palindrome);

	}
}
