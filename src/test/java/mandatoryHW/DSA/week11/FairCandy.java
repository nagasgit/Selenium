package mandatoryHW.DSA.week11;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FairCandy 
{
	/*  https://leetcode.com/problems/fair-candy-swap/
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (2 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (2 min)
		  #1:
		  Input: 
		  Output: 
		  
		  #2:
		  input: 
		  output: 
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (5 mins)
				1) Iterate the first array and find out the sum of them (sumArr1)
				2) iterate the second arr and get the sum of them (sumArr2)
				3) Create a hashset and add one of the array to the set
				4) Initialize variable => diff to find a differnece between sum of arr1 and arr2
				5) iterate the other loop and sum up the index with diff and see if sum exists in set
				6) if exists return sum and index value  
				

		6.Dry run the pseudo code with all test data from step #2 (2 mins)
		  yes
		7.Write the code on notepad (2 mins)
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
		int[] actual = fairCandy(new int[] {1,2}, new int[] {2,3});
		Assert.assertEquals(actual, new int[] {1,2});
	}
	
	public int[] fairCandy(int[] aliceSizes, int[] bobSizes)
	{
		int sumA = 0; int sumB = 0;
		Set<Integer> uniqueVal = new HashSet<Integer>();
		
		for (int i = 0; i < aliceSizes.length; i++) 
		{
			sumA+=aliceSizes[i];
			uniqueVal.add(aliceSizes[i]);
		}
		
		for (int j = 0; j < bobSizes.length; j++) {
			sumB+=bobSizes[j];
		}
		
		int difference = (sumA-sumB)/2;
		
		for (int bobVal : bobSizes) 
		{
			int target = bobVal + difference;
			if (uniqueVal.contains(target))
				return new int[] {target,bobVal};
		}
		
		return null;
	}
}
