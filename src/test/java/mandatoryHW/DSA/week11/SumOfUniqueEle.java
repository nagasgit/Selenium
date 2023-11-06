package mandatoryHW.DSA.week11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfUniqueEle 
{
	/*https://leetcode.com/problems/sum-of-unique-elements/
	/* Time - O[n]
	 * Space - O[1]
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
				1) Create a hashmap
				2) Initialize sum variable as 0
				3) Iterate the loop
					a) add all the numbers to map
				4) Iterate the entryset created in the map and sum the keys
				   which has value is equals to 1
				5) return sum

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
	
	
	public void tc()
	{
		int actual = sumofUniqueNos(new int[] {1,1,1});
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void tc1()
	{
		int actual = sumofUniqueNos(new int[] {10,6,9,6,9,6,8,7});
		Assert.assertEquals(actual, 25);
	}
	
	public int sumofUniqueNos(int[] nums)
	{
		
		/*
		 * int sum = 0; Set<Integer> uniqueVal = new HashSet<Integer>(); for (int i :
		 * nums) { if (!uniqueVal.contains(i)) { sum = sum + i; uniqueVal.add(i); }else
		 * { sum = sum - i; } }
		 * 
		 * if (uniqueVal.size() == 1) return 0;
		 * 
		 * return sum;
		 */
		 
		
		  int sum = 0; 
		  Map<Integer, Integer> uniqueVals = new HashMap<Integer,Integer>();
		  for (int i : nums)
		  	{ 
			  uniqueVals.put(i, uniqueVals.getOrDefault(i, 0)+1);	 
			}		  
		  for (Map.Entry<Integer, Integer> keyVal : uniqueVals.entrySet()) 
		  {
			 if (keyVal.getValue() == 1)
				 sum = sum + keyVal.getKey();
		  }
		  return sum;
		 
	}
}
