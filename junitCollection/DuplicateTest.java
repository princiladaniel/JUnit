package junitCollection;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Set;

import org.junit.Test;

public class DuplicateTest {
	
@Test
public void validCaseWithTwoDuplicatesTest() {
   int[] num= {1,2,3,4,5,4,6,7,8,5};
	int[] duplicate = PrintDuplicate.duplicate(num);
	int[] expectOutput= {4,5};
	System.out.println("Input:1,2,3,4,5,4,6,7,8,5 Expected:[4,5] Actual:"+Arrays.toString(duplicate));
	assertArrayEquals(expectOutput, duplicate);

}

@Test
public void validCaseWithMoreDuplicatesTest() {
   int[] num= {1,2,3,4,5,4,4,4,4,6,7,8,5};
	int[] duplicate = PrintDuplicate.duplicate(num);
	int[] expectOutput= {4,5};
	System.out.println("Input:1,2,3,4,5,4,6,7,8,5 Expected:[4,5] Actual:"+Arrays.toString(duplicate));
	assertArrayEquals(expectOutput, duplicate);

}

@Test
public void validCaseForNoDuplicatesTest() {
   int[] num= {1,2,3,4,5,6,7,8};
	int[] duplicate = PrintDuplicate.duplicate(num);
	int[] expectOutput= {};
	System.out.println("Input:1,2,3,4,5,4,6,7,8,5 Expected:[] Actual:"+Arrays.toString(duplicate));
	assertArrayEquals(expectOutput, duplicate);

}

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
