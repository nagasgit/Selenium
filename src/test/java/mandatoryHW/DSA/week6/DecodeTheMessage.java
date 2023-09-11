package mandatoryHW.DSA.week6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DecodeTheMessage 
{
	/* 
	   * 1.Understanding the problem to detailed level (clarity on input and output, constraints) 
				   Yes - 2mins
		
		2.Frame Test data (valid, invalid, complex and edge cases)
		    yes - 5 mins
		    Input Strings:
		     		   key = "the quick brown fox jumps over the lazy dog"
		           message = "vkbs bs t suepuv";
		    Output - "this is a secret"
		 
		 	Input Strings:
		     		   key = "my india" (ab cdecf)
		           message = "aidni ym";
		    Output - "fcedc ba"
			
		
		3. Do you know the Solution? Yes
		6. Dry run the pseudo code with all test data from step #2
			Yes - 3 mins
		7.Write the code on notepad
			Yes - 3 min
		8. Dry run the code with all test data from step #2
			Yes - 1 min
		9. Write code on IDE (remember to add comments and practice coding standards)
			4 mins
		* 
		* 
		* Pseudo Code:
		* Get the input strings key and message
		* Trim the spaces in key strings using regex
		* Create a hash map and add all the unique key chars itearting to key length
		* assign values for each unique chars from a to z in order
		* create a string builder 
		* Iterate a loop till message length
		* if map contains the message values, get the value of the key map and append it using string
		* builder
		* return the string

		*/
	
	@Test
	public void test1()
	{
		String actual = decodeMsg("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
		Assert.assertEquals(actual, "this is a secret");
	}
	
	@Test
	public void test2()
	{
		String actual = decodeMsg("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
		Assert.assertEquals(actual, "the five boxing wizards jump quickly");
	}
	
	public String decodeMsg(String key, String message)
	{
		String newStr = key.replaceAll("\\s+", "");
		StringBuilder res = new StringBuilder();
		
		Map<Character, Character> letters = new LinkedHashMap<Character, Character>();
		
		/*
		 * char ch = 'a'; for (int i = 0; i < key.length(); i++) {
		 * 
		 * if (!decodeKey.containsKey(key.charAt(i))) { decodeKey.put(key.charAt(i),
		 * ch++); } }
		 */
		
		char original = 'a';
	     for (int i = 0; i < newStr.length() ; i++) {
	         if (!letters.containsKey(newStr.charAt(i))){
	             letters.put(newStr.charAt(i),original++);
	         }
	     }
	     
		System.out.println(letters);
		
		for (int i = 0; i < message.length(); i++) 
		{
			if (letters.containsKey(message.charAt(i)))
			{
				res.append(letters.get(message.charAt(i)));
			}else {
				res.append(message.charAt(i));
			}
		}
		
		return res.toString();
	}
}
