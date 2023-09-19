package mandatoryHW.DSA.week8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString 
{
	/* Pseudo Code
	 * 1) i/p - String
	 * 2) Create a char array with string length
	 * 3) Iterate the loop till string length
	 * 		a) Assign the last char to char[i]
	 * 		b) first char of string to last char in array
	 * 4) convert the char array to string and return 
	 * 
	 */
	
	@Test
	public void test1()
	{
		String actual = reverseStr("reverse the string");
		Assert.assertEquals(actual, "gnirts eht esrever");
	}
	
	public String reverseStr(String str)
	{
		char[] reverse = new char[str.length()];
		
		for (int i = 0; i < str.length()/2; i++) 
		{
			reverse[i] = str.charAt(str.length()-(i+1));
			reverse[reverse.length-(i+1)] = str.charAt(i);
		}
		
		return String.valueOf(reverse);
	}
	

}
