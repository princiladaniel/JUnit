package junitCollection;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoDuplicateNumberTest {
@Test
public void twoDuplicateInputTest(){
	String mostDuplicate = FindMostDuplicateNumber.mostDuplicate("baabab");
	System.out.println("Input:abbaba Expected:ab Actual:"+mostDuplicate);
	assertEquals("ab", mostDuplicate);	
}
@Test
public void oneDuplicateInputTest() {
	String mostDuplicate = FindMostDuplicateNumber.mostDuplicate("baaba");
	System.out.println("Input:baaba Expected:a Actual:"+mostDuplicate);
	assertEquals("a", mostDuplicate);	
}
@Test
public void noDuplicateInputTest() {
	String mostDuplicate = FindMostDuplicateNumber.mostDuplicate("abcd");
	System.out.println("Input:abcd Expected:[] Actual:"+mostDuplicate);
	assertEquals(" ", mostDuplicate);	
}

}
