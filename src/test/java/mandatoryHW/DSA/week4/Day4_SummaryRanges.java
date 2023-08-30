package mandatoryHW.DSA.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_SummaryRanges {
	
			// O[N] - Linear Notation
	
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - more than 1 hr
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				POsitive data1:  [0, 1, 2, 4, 5, 7]
				Positive data2:  [0, 2, 3, 4, 6, 8, 9]
				Edge Case: 		 [0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,17]
			
			3.Do you know the Solution? Yes
			
			5. Derive Pseudo code in paper (for the best chosen approach)
			     Use ChatGPT to get approach or hints not the entire solution or complete code. USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + Remember how your brain is converting the test data input to its expected output!
				Yes - 5 mins
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 1 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				10 mins		
		 */
		
			/* Problem Statement
			 * https://leetcode.com/problems/summary-ranges/
			 */
		
		/*
		 * Pseudo code: 
		 * Create an empty list
		 * Initialize two variables start, end and assign first value in start, and assign start to end
		 * for loop to traverse from 0 to array len
		 * while condition to check the i + 1 < nums.len && first and second number in the array are equal
		 * if so, assign nums[i+1] to end variable and increment i value
		 * if condition to check whether the start and end are equal
		 * if equal then convert the start to string and add it to list
		 * else
		 * list.add(start+"->"+end)
		 * finally return the list
		 * 
		 */
	// 0,1,2,4,5,7
	@Test
	public void test1() {
		List<String> expected = Arrays.asList(new String[] { "0->2", "4->5", "7" });
		List<String> actual = summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 });
		Assert.assertEquals(actual, expected);
	}

	@Test
	public void test2() {
		List<String> expected = Arrays.asList(new String[] { "0", "2->4", "6", "8->9" });
		List<String> actual = summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 });
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test3() {
		List<String> expected = Arrays.asList(new String[] { "0->15","17" });
		List<String> actual = summaryRanges(new int[] { 0, 1, 2, 3, 4, 5, 6,7,8,9,10,11,12,13,14,15,17});
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void test4() {
		List<String> expected = Arrays.asList(new String[] { "-2->-1", "2->5","7" });
		List<String> actual = summaryRanges(new int[] { -2, -1, 2, 3, 4, 5, 7 });
		Assert.assertEquals(actual, expected);
	}

	public List<String> summaryRanges(int[] nums) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < nums.length; i++) {    //O[N]

			int startVal = nums[i];
			int endVal = startVal;

			while ((i + 1 < nums.length) && (nums[i + 1] - nums[i] == 1)) {   //O[N]
				i++;
			} 
			
			if (startVal == endVal) {
				result.add(String.valueOf(startVal));
			} else {
				result.add(startVal + "->" + endVal);
			}

		}

		return result;
	}

}
