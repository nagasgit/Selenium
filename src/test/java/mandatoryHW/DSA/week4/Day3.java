package mandatoryHW.DSA.week4;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day3 {
	
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - more than 25 mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 3 mins
			    Positive data - [1,4,3,2]
		  	    Positive data1- [6,2,6,5,1,2]
		  	    Edge case - [5,5,6,6]
			
			3.Do you know the Solution? Yes
			
			5. Derive Pseudo code in paper (for the best chosen approach)
			     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
				Yes - 2 mins
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 1 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				4 mins
			
		 */
	
			/* Problem Statement
			 * https://leetcode.com/problems/array-partition/
			 * 
			 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) 
			   such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
			 */
		
		/*
		 * Pseudo code: 
		 * Get the input array and Sort the array
		 * Initialize the sum variable with 0
		 * For loop to traverse from 0 to array length with the increment value of 2
		 * sum all the second values and return the maximum sum * 
		 */
	
	@Test
	public void test1()
	{
		int actual = maxSum(new int[] {1,4,3,2});
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void test2()
	{
		int actual = maxSum(new int[] {6,2,6,5,1,2});  //1,2,2,5,6,6
		Assert.assertEquals(actual, 9);
	}
	
	@Test
	public void test3()
	{
		int actual = maxSum(new int[] {5,6,6,5});  //1,2,2,5,6,6
		Assert.assertEquals(actual, 11);
	}
	
	public int maxSum(int[] nums)
	{
		int sum = 0;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i=i+2) 
		{
			sum = sum + nums[i];
		}
		
		return sum;
	}
	

}
