package mandatoryHW.DSA.week11;

import java.util.HashMap;
import java.util.Map;

public class Pangram 
{
	/* https://leetcode.com/problems/check-if-the-sentence-is-pangram/submissions/
	/* Time - O[n]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes (1 min)
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data: (1 min)
		  #1:
			 Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
			 Output: true
		  
		  #2:
			Input: sentence = "leetcode"
			Output: false
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code: (2 mins)
				1) Create a hashmap
				2) iterate the loop for the sentence length
					a) add all the chars to map
				3) check if map.size == 26

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
	
	public boolean pangram(String sentence)
	{
		Map<Character, Integer> pangram = new HashMap<Character, Integer>();
		if (sentence.length() < 26)
			return false;
		for (int i = 0; i < sentence.length(); i++) {
			pangram.put(sentence.charAt(i), pangram.getOrDefault(sentence.charAt(i), 0) + 1);
		}

		return pangram.size() == 26;
	}
}
