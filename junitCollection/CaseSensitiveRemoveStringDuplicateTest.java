import static org.junit.Assert.assertEquals;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class CaseSensitiveRemoveStringDuplicateTest {
	@Test
    public void test1() {
    	String[] strArray ={"We","we","java","Java","Session","session","java","session"};	
        Set<String> removeDups =SetDuplicate.removeDups(strArray);
        Set <String> expectedOutput= new LinkedHashSet<String>();
        expectedOutput.add("We");
        expectedOutput.add("We");
        expectedOutput.add("java");
        expectedOutput.add("Java");
        expectedOutput.add("Session");
        expectedOutput.add("session");
        System.out.println("Input:\"We\",\"we\",\"java\",\"Java\",\"Session\",\"session\",\"java\",\"session\"  Expected:[We,we,java,Java,learn,Session,session] Actual:"+removeDups);
        assertEquals(removeDups, expectedOutput);

	}

}
