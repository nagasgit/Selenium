package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveAllZeros 
{
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: 
		  output:  
		  
		  #2:
		  input: 
		  output: 
		  
		  #2:
		  input:  
		  output: 
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
				- Initialize start and end variable as 0
				- Iterate the loop till intput array length
					a) condiiton 1 to check if input[start] == 0 && input[end] == 0
						end++;
					b) condition 2, check if input[start] == 0 && input[end] == not 0
						initialize temp variable
						assign input[start] to temp
							   input[start] = input[end]
							   input[end] = temp;
							   start++ and end++;
					c) condition 3, check if input[start] = non zero and input[end] = zero
							start++ and end++;
		  	
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
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		int[] actual = moveZeros(new int[] {0,1,0,3,12});  //0,1,0,3,12 //12,3,0,1,0
		Assert.assertEquals(actual, new int[] {1,3,12,0,0});
	}
	
	@Test
	public void test2()
	{
		int[] actual = moveZeros(new int[] {0,0});  //0,1,0,3,12 //12,3,0,1,0
		Assert.assertEquals(actual, new int[] {0,0});
	}
	
	@Test
	public void test3()
	{
		int[] actual = moveZeros(new int[] {1,0,0,5});  //0,1,0,3,12 //12,3,0,1,0
		Assert.assertEquals(actual, new int[] {1,5,0,0});
	}

	public int[] moveZeros(int[] nums)
	{
		int temp;
		int s = 0; int e = 1;
		while (s < nums.length && e < nums.length)
		{
			if (nums[s] == 0 && nums[e] == 0)
			{
				e++;
			} else if(nums[s] == 0 && nums[e] != 0) {
				temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
				s++;e++;
			} else {
				s++;e++;
			}
		}
		
		return nums;
	}
}
