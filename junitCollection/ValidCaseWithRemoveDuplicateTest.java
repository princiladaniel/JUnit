package junitCollection;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;

public class ValidCaseWithRemoveDuplicateTest {
	@Test
	public void removeduplicate() {
		
		Set<Character> removedup = RemoveDuplicate.removedup("amazon");
		System.out.println("Input:amazon Expected:m z o n Actual:"+removedup);
		assertEquals(removedup,removedup );
	
	}
	@Test
	public void ValidCaseWithoutDuplicateTes() {
		
		Set<Character> removedup = RemoveDuplicate.removedup("myntra");
		System.out.println("Input:myntra Expected:m y n t r a Actual:"+removedup);
		assertEquals(removedup,removedup );
	
	}
	
}
