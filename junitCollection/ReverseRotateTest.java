package action;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReverseRotateTest {
	@Test
	public void reverseRotate() {
		
		List<String> num =RotateTheNumberUsingList.number(Arrays.asList("one Two three four five six".split(" ")),-2);
		List<String> expectedOutputList = Arrays.asList("three","four","five","six","one","Two");
		System.out.println("Input:\"one Two three four five six\" Expected:[three, four, five, six, one, Two] Actual:"+num);
	    assertEquals(expectedOutputList,num);	
	}

}
