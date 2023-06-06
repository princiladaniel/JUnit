import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumTest5 {
	@Test(timeout = 3000)
	public void validTest() {
		boolean palindrome = Solution.isPalindrome(-1001);
		System.out.println("Input:-1001 ~ Expected:false ~ Actual:" + palindrome);
		assertEquals(false, palindrome);

	}
}
