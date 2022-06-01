package junitCollection;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NegativeTestCaseForNullCheckTest {
	@Test
	public void negativeTestCaseForNullCheckTest() {
	  
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			PrintDuplicate.duplicate(null);
	   });

	   String expectedMessage = "Invalid input";
	   String actualMessage = exception.getMessage();

	   System.out.println("Input:null Expected: "+expectedMessage+ " Actual: "+actualMessage);
	   assertTrue(actualMessage.contains(expectedMessage));

	}
}
