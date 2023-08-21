package mandatoryHW.week4;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day1 {

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
	 * Problem Statement: https://leetcode.com/problems/can-place-flowers/*
	 * 
	 * TEst Date: Positive data - [1,0,0,0,1], n = 1 Positive data1 -
	 * [1,0,0,0,0,0,1], n = 2 Negative data - [1,0,0,0,1], n = 2
	 */

	/*
	 * Pseudo code: 1) Get the integer array and number n 2) Find out length of the
	 * array 3) for loop to traverse from 0 to len 4) if conditions to check arr[i]
	 * == 1 && arr[i+2] == 0 5) assign arr[i+2] = 1; 6) if ((i+2) >= arr.len) 7)
	 * return true; *
	 */

	@Test
	public void test1() {
		boolean actual = flowers(new int[] { 1, 0, 0, 0, 1 }, 1);
		Assert.assertEquals(actual, true);
	}

	@Test
	public void test2() {
		boolean actual = flowers(new int[] { 1, 0, 0, 0, 1 }, 2);
		Assert.assertEquals(actual, false);
	}

	@Test
	public void test3() {
		boolean actual = flowers(new int[] { 1, 0, 1, 0, 0 }, 2);
		Assert.assertEquals(actual, false);
	}

	@Test
	public void test4() {
		boolean actual = flowers(new int[] { 0, 0, 1, 0, 0 }, 2);
		Assert.assertEquals(actual, true);
	}

	public boolean flowers(int[] arr, int n) {
		int len = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (n == 0)
				return true;

			if ((n > 0) && ((i + 2) >= len)) {
				return false;
			}
			if ((n > 0) && (arr[i] == 1) && (arr[i + 2] == 0)) {
				arr[i + 2] = 1;
				n--;

			} else if ((n > 0) && (arr[i] == 0) && (arr[i + 2] == 1)) {
				arr[i] = 1;
				n--;
			} else if ((n > 0) && (arr[i] == 0) && (arr[i + 1] == 0) && (arr[i + 2] == 0)) {
				arr[i] = 1;
				n--;
				if (n > 0) {
					arr[i + 2] = 1;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
		return false;
	}

}
