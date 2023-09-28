package mandatoryHW.DSA.week9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticTriplets 
{
	/* Time - O[n/2]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: [0,1,4,7,10]
		  output:  2
		  
		  #2:
		  input: [4,5,6,7,8]
		  output: 1
		  
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
				1) Iterate the loop from 1 to n-1
				2) assign 0 to left and 2 to right
				3) inner while loop to check if left >= 0 and right < n
				4) condition to check right - j and j - left == diff
					a) if matches increment the count and right,decrement the left
					b) else if right - j matches then decrment the left, else
					   increment the right
				3) return count;	

		6.Dry run the pseudo code with all test data from step #2
		  yes
		7.Write the code on notepad
		  yes
		8. Dry run the code with all test data from step #2
		  yes
		9. Write code on IDE (remember to add comments and practice coding standards)
		  yes
		10. Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		  
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 * 
	 */
	
	@Test
	public void tc1()
	{
		int actual = arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3);
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void tc2()
	{
		int actual = arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2);
		Assert.assertEquals(actual, 2);
	}
	
	public int arithmeticTriplets(int[] nums, int diff)
	{
		int count = 0;
		for (int j = 1; j < nums.length-1; j++) 
		{		
		int left = j - 1;
		int right = j + 1;
		while (left >= 0 && right < nums.length) {
			if (nums[right] - nums[j] == diff &&
					nums[j] - nums[left] == diff) {
				count++;left--;right++;
			} else if (nums[right] - nums[j] == diff) {
				left--;
			} else if (nums[j] - nums[left] == diff) {
				right++;
			} else {
				left--;right++;
			}
		}
		}
		return count;
	}
}
