package reverseString;



import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Test;

public class LearnException {
	
	@Test
	public void newException(){
	Exception exception =assertThrows(IllegalArgumentException.class,()-> {
		ReverseString.reversestr(null);
		});

   String expectedMessage = "Invalid input";
   String actualMessage = exception.getMessage();
   System.out.println("Input:null, Expected Output:null, Actual Output:"+actualMessage);
   assertTrue(actualMessage.contains(expectedMessage));
   
}
}