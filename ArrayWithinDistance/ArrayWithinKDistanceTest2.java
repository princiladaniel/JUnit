import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayWithinKDistanceTest2 {

	@Test(timeout = 3000)
	public void validTest() {
		int[] arr = { 1, 2, 3, 4, 1, 2, 3, 4 };
		int n = arr.length;
		boolean output = Solution.checkDuplicatesWithinK(arr, n, 3);
		System.out.println("Input:{1, 2, 3, 4, 1, 2, 3, 4} ~ 3 ~ Expected:false ~ Actual:" + output);
		assertEquals(false, output);
	}
}
