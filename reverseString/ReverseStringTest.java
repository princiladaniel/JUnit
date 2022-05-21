package reverseString;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.junit.Test;
public class ReverseStringTest {
@Test
public void validString(){
	String reverseString = ReverseString.reversestr("i am going good");
	System.out.println("Input:i am going good, Expected:doog gniog ma i, Actual:"+reverseString);
	assertEquals(reverseString, reverseString);
	
}

}
