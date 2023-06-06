import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayWithinKDistanceTest {

	@Test(timeout = 3000)
	public void validTest() {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int n = arr.length;
		boolean output = Solution.checkDuplicatesWithinK(arr, n, 3);
		System.out.println("Input:{ 10, 5, 3, 4, 3, 5, 6 },3, Expected:true , Actual:" + output);
		assertEquals(true, output);
	}
}
