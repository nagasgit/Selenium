package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveOddNums 
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
		  //[1,2,3,5,6]
			1) I/p - int[]
			   o/p - int[]
			2) create two variables start and end as 0
			3) while start and end less than total nums length
			4) check if nums[start] % 2 == 0 and end %2 == 0, no swap
			5) increment the end
			6) start %2 == 0 and end not equal to 0, swap the position
			7) now increment start and end
			8) return nums
			
			
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
		Assert.assertEquals(actual, new int[] {2,6,3,5,1});
	}
	
	@Test
	public void test2()
	{
		int[] actual = moveOddnums(new int[] {0});
		Assert.assertEquals(actual, new int[] {0});
	}
	
	public int[] moveOddnums(int[] nums)
	{
		int s = 0; int e = 1;
		int temp;
		while (s < nums.length && e < nums.length)
		{
			if ((nums[s] % 2 != 0) && (nums[e] % 2 != 0))
			{
				e++;
			} else if (nums[s] % 2 != 0 && nums[e] % 2 == 0)
			{
				temp = nums[e];
				nums[e] = nums[s];
				nums[s] = temp;
				s++;e++;			
			}else  {
				s++;e++;
			}
		}
		return nums;
	}
}
