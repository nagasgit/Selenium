package mandatoryHW.DSA.week8;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinimumScores_SlidingWindow {
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output,
	 * constraints) Yes 2.Frame Test data (valid, invalid, complex and edge cases)
	 * Test Data: #1: input: int[4,2,6,7], int k = 2 // 2,4,6,7 output: 1 // 4-2 =
	 * 2, 6-4=2, 7-6 =1
	 * 
	 * #2: input: int[4] output: 0
	 * 
	 * #3: input: int [-20,-40,40,45] output: 0
	 * 
	 * 3.Do you know the Solution? yes 4.Do you have any alternate approaches?
	 * (Thing of alternate approaches) yes 5.Derive Pseudo code in paper (for the
	 * best chosen approach) Pseudo Code: 1) Initialize pointer variable as 0 and
	 * res = Integer.Max_Value and diff as 0 2) sort the array 3) Iterate the loop
	 * for the first k index 4) find the difference between first 2 index 5) store
	 * it in min 6) check if pointer < nums.length 7) diff between the next two
	 * index and check if the diff is < minval 8) if diff is minimu, then store the
	 * new min value 9) loop it until pointer < nums.length, return the min
	 * 
	 * 
	 * 6.Dry run the pseudo code with all test data from step #2 yes 7.Write the
	 * code on notepad yes 8. Dry run the code with all test data from step #2 yes
	 * 9. Write code on IDE (remember to add comments and practice coding standards)
	 * yes 10. Test the code + Debug the code (if any failures) Debug like a pro
	 * using debugging options of IDE
	 * 
	 * 11. Check for any gaps of code optimization (if not optimized already in Step
	 * #9)
	 * 
	 */

	@Test
	public void test() {
		int actual = minimumScores(new int[] {4,2,1,5,6}, 2); //1,2,4,5,6
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test1() {
		int actual = minimumScores(new int[] {5,3,8,7,6,3,9,12}, 3); //3,3,5,6,7,8,9,12
		Assert.assertEquals(actual, 2);
	}

	/*
	 * Time complexity - O[nlogn]
	 * Space Complexity - O[1]
	 */
	public int minimumScores(int[] nums, int k) {
		int minscore = Integer.MAX_VALUE;
		int diff = 0;
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length-k; i++) 
		{
			diff = nums[i+k-1] - nums[i];
			minscore = Math.min(diff, minscore);
		}
		return minscore;
	}
}
