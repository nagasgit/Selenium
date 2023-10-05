package mandatoryHW.DSA.week11;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConsistentStrings 
{
	/*https://leetcode.com/problems/sum-of-unique-elements/
	/* Time - O[n2]
	 * Space - O[n]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (1 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data 1: (1 min)
			Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
			Output: 2
		  
		  Test Data 2: (1 min)
			Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
			Output: 7
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (2 mins)
				1) Create a hashmap
				2) Iterate the allowed string, and all the chars to map
				3) for loop to iterate each words from the string
				4) check if the map contains each char of the word,
					if any new chars exists, set the ind = 1
					and check if ind is 1 then move on to next word, else
					increment the count++
				5) return count

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
		int actual = consistentString("ab", new String[] {"ad","bd","aaab","baa","badab"});
		Assert.assertEquals(actual, 2);
	}
	
	public int consistentString(String allowed, String[] words)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : allowed.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int count = 0;
		int ind = 0;
		for (int i = 0; i < words.length; i++) {
			ind = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if (!map.containsKey(words[i].charAt(j))) {
					ind = 1;
				}
			}
			if (ind == 0)
				count++;
		}
		return count;
	}
	
}
