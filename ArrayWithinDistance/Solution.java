public class Solution {
	public static boolean checkDuplicatesWithinK(int[] arr, int n, int k) {
		for (int i = 0; i < n; i++) {
			int j = i + 1;
			int range = k;
			while (range > 0 && j < n) {
				if (arr[i] == arr[j]) {
					return true;
				}
				j++;
				range--;
			}
		}
		return false;
	}

}
