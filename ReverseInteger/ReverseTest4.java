import static org.testng.Assert.assertEquals;
import org.junit.Test;

public class ReverseTest4 {
	@Test(timeout = 3000)
	public void validTest1() {
		int reverse = Solution.reverse(120);
		System.out.println("Input:120 ~ Expected:21 ~ Actual:" + reverse);
		assertEquals(21, reverse);
	}
}
