package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeArrays 
{
/*
 * Given an input String,return a boolean array by validate each of the word is a palindrome.
		Input = "this is a Tst"
		output = [false, false, true, true]
 * Contraints: not casesensitive, not empty
 * 
 * Pseudo Code:
 * split the string and convert it as array
 * create an boolean array with the length of array
 * Iterate the array using for loop
 * 	initialize two variables; left as 0 and right in center point
 *  Iterate the word until right < length of the word
 *  if each chars of left and right matching, increment left -- and right ++;
 *  if not add false to the array and move on
 *  
 */
	
	@Test
	public void tc1()
	{
		boolean[] actual = palindrome("this is a tst");
		Assert.assertEquals(actual, new boolean[] {false,false,true,true});
	}
	
	public boolean[] palindrome(String s)
	{
		String[] split = s.split(" ");
		boolean[] res = new boolean[split.length];
		for (int i = 0; i < split.length; i++) 
		{
			String str = split[i];
			int left = str.length()/2-1; int right;
			if (str.length()%2 == 0)
				right = str.length()/2;
			else
				right = str.length()/2 + 1;
			
			res[i] = true;
			while (right < str.length())
			{
				if (str.charAt(left) != str.charAt(right))
				{
					res[i] = false;
					break;
				} else {
					left--;right++;
				}
			}
			//res[i] = true;
		}
		return res;
	}
}
