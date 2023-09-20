package mandatoryHW.DSA.week9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NoOfSubArrs 
{

	/* Time - O[n/2]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: 
		  output:  
		  
		  #2:
		  input: arr<3
		  output: 0
		  
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			1)Initialize left variable as 0 and right var as (leng - (len-3));Count = 0;int avg;
			2)Iterate the loop till right
				a) get the first 3 index values
				b) check if avg of 3 is >= threshold, increment the counter
			
			3)iterate the loop again till arr length from right
				a) avg = (sum)+nums[right]-nums[0]/3
				b) if avg >= threshold, increment the counter
				c) else right++
			4) return count;

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
		int actual = noOfSubArrs(new int[] {2,2,2,2,5,5,5,8}, 3, 4);
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void tc2()
	{
		int actual = noOfSubArrs(new int[] {8246,1867,193,4539,2650,4721,2944,5777,8055,
				7502,4334,2137,3658,4156,4628,1139,7963,8035,6008,8427,1841,9169,
				1059,6158,9116,8052,7074,7866,584,666,192,8081,8273,2809,3017,7852,
				1869,3395,4649,5366,8834,9100,1643,9511,4136,3897,7193,2500,2721,8477,
				2887,8300,3922,579,4228,7983,4247,5362,5581,9270,8602,1944,240,6044,6036,
				1219,6901,2007,2123,9699,3388,390,9144,7697,5160,6442,7078,9758,8841,2064,
				4096,146,7362,3952,2346,4171,7598,1201,1860,9101,8979,8437,1989,5349,5148,
				9422,7217,1406,8414,3586,5935,7395,2257,7802,9449,3824,
				6874,3684,4252,3947,8985,1052,7295,2976,2045,2315,4887,
				307,8784,988,942,7960,747,1593,1112,7874}, 1, 307);
		Assert.assertEquals(actual, 122);
	}
	
	public int noOfSubArrs(int[] arr, int k, int threshold)
	{
		int pointer =0;
		int count = 0; int avg = 0; int sum = 0;
		
		if (arr.length < k)
			return count;
		
		while (pointer < k)
		{
			sum = sum + arr[pointer++];
		}
		
		if((sum/k) >= threshold)
			count++;
		
		while (pointer < arr.length)
		{
			sum = sum+arr[pointer]-arr[pointer-k];
			if ((sum/k) >= threshold)
				count++;
			pointer++;
		}
		return count;
	}
}
