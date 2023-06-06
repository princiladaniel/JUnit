import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidStringTest {
	@Test
	public void validString1() {

		boolean reverseString = Solution.checkPalindrome("A man, a plan, a canal: Panama");
		System.out.println("Input:A man, a plan, a canal: Panama ~ Expected:true ~ Actual:" + reverseString);
		assertEquals(true, reverseString);

	}

}
