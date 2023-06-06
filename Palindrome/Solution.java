public class Solution {
	public static boolean checkPalindrome(String input) {
		String replacestr = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		System.out.print(replacestr);
		for (int i = 0, j = replacestr.length() - 1; i <= j; i++, j--) {
			System.out.println(replacestr.charAt(i));
			System.out.println(replacestr.charAt(j));
			if (replacestr.charAt(i) != replacestr.charAt(j)) {

				return false;
			}
		}

		return true;
	}
}
