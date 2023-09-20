package mandatoryHW.DSA.week9;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidingWindow_DistinctChars 
{
	/*
	 * Substrings of Size Three with Distinct Characters
	 * 
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 * /* Time - 
	 * 	  Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: xyzzaz
		  output:  1
		  
		  #2:
		  input: aababcabc
		  output: 4
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			1) Initialize variables, left as 0 and right as len-3, count = 0
			2) Iterate the loop till right
				a) create a map and add all chars to map
			3) check if map size is 3 then increment the count
			4) Iterate from right till length
				a) add right to the map 
				b) remove left from the map
				c) increment if map size is 3
			5) return count 

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
		int actual = distinctChars("xyzzaz");
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test2()
	{
		int actual = distinctChars("aababcabc");
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void test3()
	{
		int actual = distinctChars("stc");
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test4()
	{
		int actual = distinctChars("a");
		Assert.assertEquals(actual, 0);
	}
	
	public int distinctChars(String s)
	{
		int left = 0; int right = (s.length()- (s.length()-3));
		int count = 0;
		Map<Character, Integer> chars = new LinkedHashMap<Character, Integer>();
		if (s.length() < 3)
			return count;
		while (left < right)
		{
			chars.put(s.charAt(left), chars.getOrDefault(s.charAt(left), 0)+1);
			left++;
			if (chars.size() == 3)
				count++;
		}
		while (right < s.length()) 
		{
			chars.put(s.charAt(right), chars.getOrDefault(s.charAt(right), 0)+1);			
			if (chars.get(s.charAt(right-left)) == 1) {
				chars.remove(s.charAt(right-left));
			}else {
				chars.put(s.charAt(right-left), chars.get(s.charAt(right-left))-1);
			}
			if (chars.size() == 3)
				count++;
			right++;
		}
		return count;
	}
}
