package mandatoryCW.week10;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssignCookies {
	/*
	 * Test Data
	 * #1:
	 * I/p: g = [1,2,3], s = [1,1]
	 * O/p: 1
	 * 
	 * #2:
	 * I/p: g = [1,2], s = [1,2,3]
	 * O/p: 1
	 * 
	 * 
	 * Pseudo Code:
	 * 1) Initialize variables => left and right as 0; count as 0
	 * 2) iterate the loop till left or right meets the greedy length
	 * 		if size of cookies greater than or equal to greedy factor
	 * 			increment left and right, and counter	
	 * 		else increment the right
	 * 3) return the count
	 */
	
	@Test
	public void tc() {
		int actual = assignCookies(new int[] {10,9,8,7}, new int[] {5,6,7,8});
		Assert.assertEquals(actual, 2);
	}
	public int assignCookies(int[] g, int[] s)
	{
		int left = 0; int right = 0; int count = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		while (left < s.length && right < g.length)
		{
			if (s[left] >= g[right])
			{
				count++; left++; right++;
			} else {
				left++;
			}
		}
		
		return count;
	}

}
