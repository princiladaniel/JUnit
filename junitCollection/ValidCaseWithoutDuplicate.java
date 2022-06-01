package junitCollection;
import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class ValidCaseWithoutDuplicate {
	@Test
	public void removeduplicate1() {
		
		Set<Character> removedup = RemoveDuplicate.removedup("myntra");
		System.out.println("Input:myntra Expected:m y n t r a Actual:"+removedup);
		assertEquals(removedup,removedup );
	
	}
}
