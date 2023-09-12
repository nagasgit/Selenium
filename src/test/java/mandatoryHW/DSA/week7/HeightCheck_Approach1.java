package mandatoryHW.DSA.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HeightCheck_Approach1 
{
	/*  1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: heights = "[1,2,3,3,4,2]"
		  output:  3  [1,2,2,3,3,4]
		  
		  #2:
		  input: heights = "[2,3,6,1,5]"
		  output: 5  after sorting [1,2,3,5,6]
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
		    1) Get the input array and initialize count variable
		    2) Create an array expected with the input length
		    3) Iterate the loop with input string length
		       a) add all the heights value as it is in the new array
		    4) Create an empty list
		    5) Sort the new array
		    6) Itearte the loop till new array length
		    	1) check each index values of new and old array 
		    		and increment the count when there is a mismatch
		    7) return count  
		       
		  	
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
	public void test1()
	{
		int actual = heightChecker(new int[] {1,2,3,3,4,2});
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void test2()
	{
		int actual = heightChecker(new int[] {2,3,6,1,5});
		Assert.assertEquals(actual, 5);
	}
	
	public int heightChecker(int[] heights)
	{
		int count = 0;
		int[] expected = new int[heights.length];
		
		for (int i = 0; i < heights.length; i++) {
			expected[i] = heights[i];
		}
		Arrays.sort(expected);
		List<Integer> res = new ArrayList<Integer>();
		
		for (int i = 0; i < expected.length; i++) {
			if(expected[i] != heights[i])
			{
				res.add(i);
				count++;
			}
		}
		System.out.println(res);
		return count;
	}

}
