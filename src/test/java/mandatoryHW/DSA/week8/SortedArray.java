package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SortedArray 
{
	/*  /* 	Get the input array length
		    Iterate the loop till len/2
			Initialize variable sum = first and last index
					If sum == 9
					 Return I, leng - (i+1)

	 * 
	 * 
	 * Test Data
	 * #1:
	 * input:  [2,3,4,5], Target - 9
	 * O/p - [0,3]
	 * 
	 *  * input:  [1,4,5,5,6], Target - 10 5/2 
	 * O/p - [0,3]
	 */
	
	
	public void test1()
	{
		int[] actual = sortedArr(new int[] {1,4,3,5,6}, 10);
		Assert.assertEquals(actual, new int[] {1,4});
	}
	
	@Test
	public void test2()
	{
		int[] actual = sortedArr(new int[] {1,1,3,5,7}, 2);
		Assert.assertEquals(actual, new int[] {0,1});
	}

	public int[] sortedArr(int[] nums, int target)
	{
		int sum = 0;
		int[] res = new int[2];
		int len = nums.length;
		int left = 0; int right = len-1;
		while (left < right) {
			sum = nums[left] + nums[right];
			
			if (sum == target)
			{
				return new int[] {left,right};
			} else if (sum > target)
			{
				right--;
			} else {
				left++;
			}
			//nums.length - (i+1);
		
	}
		return null;
}
}
