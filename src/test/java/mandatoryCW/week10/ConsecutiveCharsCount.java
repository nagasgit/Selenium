package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsecutiveCharsCount {

	/*
	 * Test Data:
	 * #1
	 * i/p: leetcode
	 * o/p: 2	
	 * 
	 * #2:
	 * i/p: abcdefghabcd
	 * o/p: 0
	 * 
	 * Pseudo Code:
	 * 1) Initialize variables => left as 0 and right as 1 and max = 0
	 * 2) check if right is lesser than string length
	 * 		a) check if left and right chars are matching, if matching
	 * 			increment count, left and right
	 * 		b) assign maximum between (count+1) and max values to max variable itself
	 * 		c) else increment left and right
	 * 3) return max
	 * 
	 */
	
	
	public void tc()
	{
		int actual = maxConseChars("leetcode");
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void tc1()
	{
		int actual = maxConseChars("cc");
		Assert.assertEquals(actual, 2);
	}
	
	
	public int maxConseChars(String s)
	{
		int left = 0; int right = 1; int max = 1;int cnt = 1;
		while (right < s.length())
		{
			if (s.charAt(left) == s.charAt(right))
			{
				cnt++;right++;
				max = Math.max(cnt, max);
			}else {
				left = right; right++;
				cnt=1;
			}
		}
		return max;
	}
}
