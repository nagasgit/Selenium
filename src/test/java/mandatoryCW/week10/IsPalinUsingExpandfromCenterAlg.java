package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPalinUsingExpandfromCenterAlg 
{
/* Expand from center algorithm
 * 
 * Pseudo code:
 * Initialize variables -> left as length/2-1, right as length / 2(even), length / 2 +1 (if odd)
 * check if length is even or odd
 * while condition to check right < string length
 * if condition to check the char at left and right position, if not matches return false
 * if all conditions matches return true
 * 
 */
	
	@Test
	public void test1()
	{
		Assert.assertTrue(isPalin("malayalam"));
	}
	
	public boolean isPalin(String s) {
		
		int left = s.length()/2-1; int right;
		if(s.length()%2 == 0)
			right = s.length()/2;
		else
			right = s.length()/2+1;
		
		while (right < s.length())
		{
			if (s.charAt(left) != s.charAt(right))
			{
				return false;
			}
			right++;left--;
		}
		return true;
	}
	
}
