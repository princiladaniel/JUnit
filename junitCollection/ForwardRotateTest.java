package action;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ForwardRotateTest {
	@Test
	public void forwardRotate(){
		List<String> num =RotateTheNumberUsingList.number(Arrays.asList("one Two three four five six".split(" ")),3);
		System.out.println("Input:\"one Two three four five six\" Expected:[four, five, six, one, Two, three] Actual:"+num);
		List<String> expectedOutputList = Arrays.asList("four", "five", "six", "one", "Two","three");
	    assertEquals(expectedOutputList,num);	
	}
	
	}
