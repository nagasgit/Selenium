package mandatoryHW.week4;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day2 {
	
	/*
		1.Understanding the problem to detailed level (clarity on input and output, constraints) 
		   Yes - 2
		
		2.Frame Test data (valid, invalid, complex and edge cases)
		    yes - 3 mins
		    Positive data - [1,2,2,4] - Result - [2,3]
	  	    Positive data1 -[1,1]  - Result [1,2]
	  	    edge case = [1]  - Result [-1,-1]
		
		3.Do you know the Solution? Yes
		
		4.Do you have any alternate approaches? (Thing of alternate approaches) - Yes
		
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

	/*
	 * Pseudo code: 
	 * Get the integer array - nums
	 * Create an empty array with the length of 2
	 * for loop to traverse through the len from 0
	 * Check ith and i+1 index in the array, assign the duplicates to the new arr 0th index position
	   and duplicate value + 1 to 1st index position
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
	
	@Test
	public void test4()
	{
		int[] actual = setMismatch(new int[] {1});
		System.out.println(Arrays.toString(actual));
		Assert.assertEquals(actual, new int[] {-1,-1});
	}
	
	public int[] setMismatch(int[] nums)
	{
		Arrays.sort(nums);
		int len = nums.length;
		int dup = -1; int missing = -1;
		int[] missNums = new int[2];
		for (int i = 0; i < nums.length; i++) {
			
			if((i+1) != nums[i])
			{
				missNums[0] = i;
				missNums[1] = i + 1;
				return missNums;
				//return missNums;
			}
			
		}
		
		return new int[] {dup,missing};
	}

}
