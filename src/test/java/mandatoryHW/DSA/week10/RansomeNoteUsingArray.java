package mandatoryHW.DSA.week10;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RansomeNoteUsingArray 
{
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: ransomNote = "abc", magazine = "abcd"
		  output: true
		  
		   #1.1:
		  input: ransomNote = "hello", magazine = "raja"
		  output: false (megazine len < ransomenote)
		  
		   #2:
		  input: ransomNote = "harish", magazine = "Harish"
		  output: false (case sensitive)
		  
		  #2:
		  input: ransomNote = "aaa", magazine = "aabbcca"
		  output: true
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
				1) Create a hashmap and initialize variable count = 0
				2) iterate using loop till megazine length
					a) add all the chars to map
				3) iterate another loop till ransomenote length
					b) check if map contains each chars of ransomenote
					c) else count++;
				4) if count != 0 then return false, else return true
			
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
	
	
	public void tc1()
	{
		boolean actual = ransomenote("abc", "abcd");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc2()
	{
		boolean actual = ransomenote("harish", "Harish");
		Assert.assertEquals(actual, true);
	}
	
	public boolean ransomenote(String ransomNote, String magazine)
	{
		int[] ch = new int[26];
		String rans = ransomNote.toLowerCase();
		String mag = magazine.toLowerCase();
		
		for (int i = 0; i < mag.length(); i++) 
		{
			ch[mag.charAt(i)-'a']++;
			ch[rans.charAt(i)-'a']--;
			if (ch[rans.charAt(i)-'a'] == -1)
				return false;
		}
		
		/*
		 * for (int i = 0; i < rans.length(); i++) { ch[rans.charAt(i)-'a']--; if
		 * (ch[rans.charAt(i)-'a'] == -1) return false; }
		 */
		
		for (int i = 0; i < 26; i++) 
		{
			if (ch[i] != 0)
				return false;
		}
		
		
		return true;
	}
}
