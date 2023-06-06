import static org.testng.Assert.assertEquals;
import org.junit.Test;

public class ReverseTest3 {
	@Test(timeout = 3000)
	public void validTest1() {
		int reverse = Solution.reverse(32);
		System.out.println("Input:32 ~ Expected:23 ~ Actual:" + reverse);
		assertEquals(23, reverse);
	}
}
