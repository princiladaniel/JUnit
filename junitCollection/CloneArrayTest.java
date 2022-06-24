package action;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CloneArrayTest {

	@Test
	public void validCloneArrayCheck() {
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        
        ArrayList<String> expected = CloneArray.cloneArray(c1);
        System.out.println("Input:"+c1+" Expected:[Red, Green, Black, White, Pink] Actual:"+expected);
        assertEquals(c1, expected);
        
	}
	
		

	

}
