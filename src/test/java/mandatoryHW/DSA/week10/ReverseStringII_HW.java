package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseStringII_HW 
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
		int left = 0; int right = k; int count = 1; char temp;
		char[] cs = s.toCharArray();
		while(right < s.length())
		{
			if (count % 2 != 0)
			{
				temp = cs[left];
				cs[left] = cs[right-1];
				cs[right-1] = temp;
			}
			count++; left+=k;right+=k;
		}
		
		return new String(cs);
	}
}
