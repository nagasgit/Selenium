package mandatoryHW.DSA.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisappearedNo 
{
	/* https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (1 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (1 min)
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (2 mins)
				Example 1:
					Input: nums = [4,3,2,7,8,2,3,1]
					Output: [5,6]
				
				Example 2:
					Input: nums = [1,1]
					Output: [2]
				
				1) Sort the array
				2) Find out the len of the array and store it in int var
				3) Create a set
				4) iterate the loop and identify the duplicate values
				5) Check if len - duplicate value exists in set
				6) if not add it to the list else add len to the list
						
		6.Dry run the pseudo code with all test data from step #2 (1 mins)
		  yes
		7.Write the code on notepad (1 mins)
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
		List<Integer> actual = disappearedNos(new int[] {4,3,2,7,8,2,3,1});
		Assert.assertEquals(actual, Arrays.asList(5,6));
	}
	
	@Test
	public void tc2()
	{
		List<Integer> actual = disappearedNos(new int[] {1,1});
		Assert.assertEquals(actual, Arrays.asList(2));
	}
	
	public List<Integer> disappearedNos(int[] nums)
	{
		Arrays.sort(nums);
		int len = nums.length;
		
		Set<Integer> duplicateVal = new HashSet<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		
		for (int num : nums) 
		{
			if (!duplicateVal.contains(num)) {
				duplicateVal.add(num);
			}else {
				int missingNum = len - num;
				if (!duplicateVal.contains(missingNum))
					output.add(missingNum);
				else
					output.add(len);
			}
		}
		Collections.sort(output);
		return output;
	}
}
