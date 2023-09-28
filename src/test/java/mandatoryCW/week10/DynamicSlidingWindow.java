package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicSlidingWindow 
{
	/* Pseudo Code:
	 * 1) Initialize the variables -> left as 0 and right as 0; count as 0; max =0;
	 * 2) check if end is less than arr length
	 * 		a) count++, if index matches 1, right++. add the max values 
	 * 		b) else left++
	 * 3) return max
	 * 
	 *  
	 *  Test Data:
	 *  #1:
	 *  I/p - 1,1,0,1,1,1
	 *  o/p - 3
	 *  
	 *  #2:
	 *  I/p - 0,0,0,0,1
	 *  o/p - 1
	 *  
	 *  #3:
	 *  I/p - 0,0,0,0,0
	 *  o/p - 0
	 *  
	 */
	
	@Test
	public void tc1()
	{
		int actual = maxConsOnes(new int[] {1,1,0,1,1,1});
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void tc2()
	{
		int actual = maxConsOnes(new int[] {0,0,1});
		Assert.assertEquals(actual, 1);
	}
	public int maxConsOnes(int[] nums)
	{
		int left = 0; int right = 0; int cnt = 0; int max = 0;
		while (right < nums.length)   //O[n]
		{
			
			if (nums[right] == 1)
			{
				cnt++;
				max = Math.max(cnt, max);
				right++;
			}else {
				if (right == nums.length)
					break;
				left++;right++;
				cnt=0;
			}
			
		}
		
		return max;
	}
}
