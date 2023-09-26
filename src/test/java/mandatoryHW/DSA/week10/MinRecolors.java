package mandatoryHW.DSA.week10;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinRecolors 
{
	
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: WWWWW, K = 6
		  output: 0
		  
		  #2:
		  input: WWWWWB, K = 3
		  output: 2
		  
		  #2:
		  input: WWWWWWWWB, K = 7
		  output: 6
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
					1) Initialize variables => left as 0, right as len - (len-k), min as 0
					2) check if length of the string is lesser than k, then return min
					3) Create a hash map
					4) Check left is lesser than right using loop till window size set
					     a) add each char into map until the window length
					     b) assign the white count to min
					5) Another loop to iterate till actual string length from right
					     a) add the right character and decrement the right - left index   
					         value
					      b) check min of mimum count between min value and white   
					           value and assign it to min
					6) Return the minimum
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
	public void tc()
	{
		int actual = minRecolors("BB", 1);
		Assert.assertEquals(actual, 0);
		}
	
	
	public int minRecolors(String blocks, int k)
	{
		int left = 0; int right = blocks.length()-(blocks.length()-k);
		int minWhite = 0;
		Map<Character, Integer> res = new LinkedHashMap<Character, Integer>();
		if (blocks.length() < k)
			return minWhite;
		while (left < right)
		{
			res.put(blocks.charAt(left), res.getOrDefault(blocks.charAt(left), 0)+1);
			left++;
			if (res.containsKey('W'))
			minWhite = res.get('W');
		}
		
		while (right < blocks.length())
		{
			res.put(blocks.charAt(right), res.getOrDefault(blocks.charAt(right), 0)+1);
			int dec = res.get(blocks.charAt(right-left));
			int newVal = dec - 1;
			res.put(blocks.charAt(right-left),newVal);
			if (res.containsKey('W')) {
				minWhite = Math.min(minWhite, res.get('W'));
			}
			right++;	
		}
		return minWhite;
	}

}
