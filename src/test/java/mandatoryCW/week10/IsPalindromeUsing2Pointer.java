package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPalindromeUsing2Pointer 
{
	/*
	 * Test Data:
	 * I/p: RADAR
	 * O/P: true
	 * 
	 * #2:
	 * I/p: appA
	 * o/p: false
	 * 
	 * Pseudo Code:
	 * Initialize two variables start as 0 and end as length -1 and char temp;
	 * check using while loop if start < end
	 * check if first and last matches, then start++ and end--
	 * else return false
	 * return true if all matches	 * 
	 * 
	 */
	
	@Test
	public void tc1()
	{
		boolean actual = isPalindrome("Appa");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void tc2()
	{
		boolean actual = isPalindrome("RADAR");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc3()
	{
		boolean actual = isPalindrome("abababababa");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc4()
	{
		boolean actual = isPalindrome("a.a");
		Assert.assertEquals(actual, true);
	}
	

	public boolean isPalindrome(String s)
	{
		int start = 0; int end = s.length()-1;
		
		while (start < end)
		{
			if (s.charAt(start) == s.charAt(end)) {
				start++;end--;
			}else {
				return false;
			}
		}
		
		return true;
	}
}
