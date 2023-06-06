import static org.testng.Assert.assertEquals;
import org.junit.Test;

public class ReverseTest2 {
	@Test(timeout = 3000)
	public void validTest1() {
		int reverse = Solution.reverse(-123);
		System.out.println("Input:-123 ~ Expected:-321 ~ Actual:" + reverse);
		assertEquals(-321, reverse);
	}
}
