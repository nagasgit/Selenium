package mandatoryHW.DSA.week11;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JewalsandStones 
{
	/* https://leetcode.com/problems/jewels-and-stones/
	/* Time - O[n*m]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (2 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (2 min)
		  #1:
			 Input: jewels = "aA", stones = "aAAbbbb"
			 Output: 3
		  
		  #2:
			Input: jewels = "z", stones = "ZZ"
			Output: 0
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (5 mins)
				1) Create a hashmap
				2) iterate the stones and add all the chars to the map
				3) iterate the loop till jewals length and get the value
				4) sum the occurance and return sum

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
	public void tc1() {
		int actual = jewalsAndStones("aA", "aAAbbbb");
		Assert.assertEquals(actual, 3);
	}
	
	public int jewalsAndStones(String jewels, String stones) 
	{
		Map<Character, Integer> occurances = new HashMap<Character, Integer>();
		for (int i = 0; i < stones.length(); i++) {
			occurances.put(stones.charAt(i), occurances.getOrDefault(stones.charAt(i), 0) + 1);
		}
		int sum = 0;
		for (int i = 0; i < jewels.length(); i++) {
			if (occurances.containsKey(jewels.charAt(i))) {
				sum = sum + occurances.get(jewels.charAt(i));
			}
		}
		return sum;
	}

}
