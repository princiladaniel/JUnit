import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotvalidStringTest {
	@Test
	public void notvalidString() {
		
			boolean reverseString =Solution.checkPalindrome("race a car");
			System.out.println("Input:race a car ~ Expected:false ~ Actual:"+reverseString);
			assertEquals(false, reverseString);
			
	}
	}

