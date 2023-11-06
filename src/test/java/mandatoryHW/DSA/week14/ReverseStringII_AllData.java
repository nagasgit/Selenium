package mandatoryHW.DSA.week14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringII_AllData {

	/* https://leetcode.com/problems/reverse-string-ii/
	 * 
	 * Pseudo Code:
	 * 1) Iterate the loop and increment i+=2*k;
	 * 2) Initialize two variables, left as i and right as Math.min (str.length-1,i+k-1) 
	 * 3) Convert the string into char array
	 * 4) another loop to traverse between left and right
	 * 5) asssign arr[left] to temp, arr[right] to left and temp to arr[right]
	 * 6) increment left and decrement right to swap
	 * 7) return array
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

		char temp;
		char[] arr = s.toCharArray();
		for (int i = 0; i < s.length(); i += 2 * k) {
			int left = i;
			int right = Math.min(s.length() - 1, i + k - 1);

			while (left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
		return new String(arr);
	}
}
