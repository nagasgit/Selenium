package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringII_OnlyPositiveCase 
{
  /*  https://leetcode.com/problems/reverse-string-ii/
   * 
   *   /*
	 * #1:
	 * Test Data:
	 * Input: s = "abcdefghi"  k = 3
	 * Output: cbadefihg
	 * 
	 * #2:
	 * Test Data:
	 * Input: s = "abcd"  k = 5
	 * Output: dcba
	 * 
	 * Pseudo Code
	 *  Initialize variables:
	 *     left = 0; right = k; count = 1;
	 *  While loop to check right is lesser than string length
	 *  check if count mod 2 not equals to o
	 *  if yes, reverse the two chars in the array
	 *  else increment the count, start+k, end+k
	 *  convert the char array to string and return;
	 */
	
	@Test
	public void tc1()
	{
		String actual = reverseStr("abcdefg", 2);
		Assert.assertEquals(actual, "bacdfeg");
	}
	
	@Test
	public void tc2()
	{
		String actual = reverseStr("abcdefg", 7);
		Assert.assertEquals(actual, "gfedcba");
	}
	
	public String reverseStr(String s, int k)
	{
		int left = 0; int right = k; int cnt = 1;
		String res = "";
		if (k > s.length())
			return s;
			
		while (right < s.length())
		{
			String subStr = s.substring(left, right);
			if (cnt % 2 != 0) 
			{
				res = res + reverseString(subStr);
			}else res = res + subStr;
			
			left+=k;right+=k;cnt++;
		}
		
		return null;
	}
	
	public String reverseString(String str)
	{
		char[] ch = str.toCharArray();
		char temp;
		
		int left = 0; int right = ch.length-1;
		while (left < right) {
			temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;right--;
		}
		
		return new String(ch);
	}
}
