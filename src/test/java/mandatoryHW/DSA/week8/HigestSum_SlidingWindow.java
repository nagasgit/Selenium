package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HigestSum_SlidingWindow 
{
	
	/* Pseudo Code:
		1) Initialize variable - 
		       maxval= Integer.MinVal, sum = 0, pointer = 0
		2) Iterate the loop till length - k
		3) sum = nums[i]+nums[i+1]+nums[i+2]
		4) maxval = Math.max(sum,maxval)
		5) return maxval"					
	 * 
	 */
	

	public void test1()
	{
		int actual = maxSum(new int[] {1,5,2,3,7,1}, 3);
		Assert.assertEquals(actual, 12);
	}
	

	public void test2()
	{
		int actual = maxSum(new int[] {1,5,2}, 3);
		Assert.assertEquals(actual, 8);
	}
	
	
	public void test3()
	{
		int actual = maxSum(new int[] {1}, 1);
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test4()
	{
		int actual = maxSum(new int[] {1,3,4,5,6}, 4);
		Assert.assertEquals(actual, 18);
	}
	
	/*
	 * Time complexity - O[2n]
	 * Space complexity - O[1]
	 * 
	 */
	public int maxSum(int[] nums, int k)
	{
		int max = Integer.MIN_VALUE; int sum = 0;
		int pointer = 0;	
		while (pointer < k) {
			sum = sum + nums[pointer];
			pointer++;
		}
		while(pointer < nums.length)
		{
			max = Math.max(max, sum);
			sum = sum + nums[pointer]-nums[pointer-k];
			pointer++;
		}		
		return Math.max(max, sum);
	}
}
