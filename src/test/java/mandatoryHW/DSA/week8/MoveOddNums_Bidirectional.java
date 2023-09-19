package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveOddNums_Bidirectional 
{
/* /*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: [1,2,3,5,6]
		  output:  [2,6,1,3,5]
		  
		  #2:
		  input: [0]
		  output: [0]
		  
		  #3:
		  input:  [1,3]
		  output: [1,3]
		  
		  #4:
		  Input: [2,4,6,0]
		  output: [2,4,6,0]
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			 * Get the input array
			 * Initialize start and end variable as 0
			 * Loop until start < end
			 * 	1) Check index 0 and last index of the array, (if index 0 % 2 != 0 && index last poisition % 2 == 0, swap it.  start++,end--
				2) else if (index 0 % 2 == 0 && index last poisition % 2 != 0), start++
				3) else if (index 0 % 2 != 0 && index last poisition % 2 != 0), end--
				4) else start++
			 * return nums	
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
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] actual = moveOddnums(new int[] {1,2,3,5,6});
		Assert.assertEquals(actual, new int[] {6,2,3,5,1});
	}
	
	@Test
	public void test2()
	{
		int[] actual = moveOddnums(new int[] {1,2,3,4,3});
		Assert.assertEquals(actual, new int[] {4,2,3,1,3});
	}
	
	@Test
	public void test3()
	{
		int[] actual = moveOddnums(new int[] {0});
		Assert.assertEquals(actual, new int[] {0});
	}
	
	public int[] moveOddnums(int[] nums)
	{
		int start = 0; int end = nums.length-1; int temp;
		while (start < end)
		{
			if (nums[start]%2 != 0 && nums[end] % 2 ==0) {
				temp = nums[end];
				nums[end] = nums[start];
				nums[start] = temp;
				start++;end--;
			} else if(nums[start]%2 == 0 && nums[end] % 2 !=0) {
				start++;end--;
			} else if (nums[start]%2 != 0 && nums[end] % 2 !=0) {
				end--;
			} else {
				start++;
			}
		}
	
		return nums;
	}
}
