package mandatoryHW.DSA.week14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringII {

	/* https://leetcode.com/problems/reverse-string-ii/
	 * 
	 * Pseudo Code:
	 * 1) Initailize variables => int left = 0; right = k; count = 1; char temp;
	 * 2) Convert the string into char array
	 * 3) while right less than string length && count % 2 != 0
	 * 4) for loop to traverse till right length
	 * 5) 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void tc1() {
		String actual = reverseStr("abcdef", 3);
		Assert.assertEquals(actual, "cbadef");
	}
	
	@Test
	public void tc2() {
		String actual = reverseStr("abcdefghk", 3);
		Assert.assertEquals(actual, "cbadefkhg");
	}
	
	@Test
	public void tc3() {
		String actual = reverseStr("abcdef", 7);
		Assert.assertEquals(actual, "fedcba");
	}
	
	public String reverseStr(String s, int k) {
		
		int left = 0; int right = k; int count = 1;
		char temp;
		char[] arr = s.toCharArray();
		
		if (s.length() < k) {
			int l = left;
			int r = s.length() - 1;
			for (int i = left; i < s.length(); i++) {
				if (l < r) {
					temp = arr[l];
					arr[l] = arr[r];
					arr[r] = temp;
					l++;
					r--;
				} else {
					break;
				}
			}
			return new String(arr);
		}
		
		while (right <= s.length()) {
			if (count % 2 != 0) {
				int l = left;
				int r = right - 1;
				for (int i = left; i < right; i++) {
					if (l < r) {
						temp = arr[l];
						arr[l] = arr[r];
						arr[r] = temp;
						l++;
						r--;
					} else {
						break;
					}
				}
			}
			left += k;
			right += k;
			count++;
		}

		return new String(arr);
	}
}
