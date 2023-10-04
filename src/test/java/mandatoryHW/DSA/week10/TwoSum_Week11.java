package mandatoryHW.DSA.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TwoSum_Week11 
{
	
	/*Pseudo Code:
	 * 
	 * 1) Get the input array and integer number
	 * 2) Assign variables => left as 0 and right as 1
	 * 3) Iterate it using while left < right
	 * 		a) sum = num[left] + num[right]
	 * 		b) check if sum is greater than target, left++
	 * 		c) else right++;
	 * 		d) if sum == target, return left, right
	 * 
	 */
	
	@Test
	public void tc1()
	{
		int[] actual = twosum(new int[] {2,3,4,5}, 9);
		Assert.assertEquals(actual, new int[] {2,3});
	}

	public int[] twosum(int[] nums, int target){
		
		//List<Integer> res = new ArrayList<Integer>();
		int sum;
		/*
		 * int[] res = new int[2]; while (left < right) { sum = nums[left] +
		 * nums[right]; if (sum > target) { res[0] = left; res[1] = right; return res; }
		 * else { left++; right++; } } return res;
		 */
		
		for (int i = 0; i < nums.length; i++) 
		{
			for (int j = 1; j < nums.length; j++) 
			{
				sum = nums[i] + nums[j];
				if (sum == target) {
					return new int[] {i,j};
				}
			}
		}
		return null;
	}
}
