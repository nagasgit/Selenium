package mandatoryHW.week4;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {
	
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,
	 * constraints) 2.Frame Test data (valid, invalid, complex and edge cases) 3.Do
	 * you know the Solution? 4.Do you have any alternate approaches? (Thing of
	 * alternate approaches) 5. Derive Pseudo code in paper (for the best chosen
	 * approach) Use ChatGPT to get approach or hints not the entire solution or
	 * complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH FOR A
	 * GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED +
	 * Remember how your brain is converting the test data input to its expected
	 * output! 6. Dry run the pseudo code with all test data from step #2 7.Write
	 * the code on notepad 8. Dry run the code with all test data from step #2 9.
	 * Write code on IDE (remember to add comments and practice coding standards)
	 * 10.Test the code + Debug the code (if any failures) Debug like a pro using
	 * debugging options of IDE 11. Check for any gaps of code optimization (if not
	 * optimized already in Step #9)
	 */

	/*
	 * Problem Statement: https://leetcode.com/problems/set-mismatch/*
	 * 
	 * TEst Date: Positive data - [1,2,2,4] - Result - [2,3]
	 * Positive data1 -[1,1]  - Result [1,2]
	 * 
	 */

	/*
	 * Pseudo code: 
	 * Get the integer array - nums
	 * Create an empty array with the length of 2
	 * for loop to traverse through the len from 0
	 * if (i+1 != nums[i]) then 
	 * 		newArr[1] = i+1 
	 * 		newArr[0] = i
	 * return newArr;
	 */
	@Test
	public void test1()
	{
		int[] actual = setMismatch(new int[] {1,2,2,4});
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(actual, new int[] {2,3});
	}
	
	@Test
	public void test2()
	{
		int[] actual = setMismatch(new int[] {1,1});
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(actual, new int[] {1,2});
	}
	
	@Test
	public void test3()
	{
		int[] actual = setMismatch(new int[] {3,3,1,2});
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(actual, new int[] {3,4});
	}
	
	public int[] setMismatch(int[] nums)
	{
		Arrays.sort(nums);
		int len = nums.length;
		int[] missNums = new int[2];
		for (int i = 0; i < nums.length; i++) {
			
			if((i+1) != nums[i])
			{
				missNums[0] = i;
				missNums[1] = i+1;
				return missNums;
			}
			
		}
		
		return null;
	}

}
