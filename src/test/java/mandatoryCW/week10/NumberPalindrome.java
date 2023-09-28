package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberPalindrome 
{

	/* Pseudo code
	 * Check the number given is > 0
	 * initialize variable -> num as 0, rev as 0
	 * check while (num > 0)
	 * num = num % 10;
	 * rev = rev + num;
	 * return rev = num
	 * 
	 */
	@Test
	public void test1()
	{
		Assert.assertTrue(numPalindrome(91919));
	}
	
	public boolean numPalindrome(int num)
	{
		int rem = 0;int rev = 0;int res = num;
		while(num > 0)
		{
			rem = num % 10;
			num = num / 10;
			rev = rev*10+rem;
		}
		//System.out.println(Integer.valueOf(str));
		return rev == res;
	}
}
