package mandatoryHW.DSA.week7;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString_CW 
{
	/* O[n/2] notation
	 * Problem stmt
	 *  input = "reverse this string"
		output= "gnirts siht esrever"
	 * 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: s = "reverse this string"
		  output:  "gnirts siht esrever"
		  
		  #2:
		  input: 
		  output: 
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			1) Get the input string
			2_ find out the lnegth of the string and initialize the variable str = "";
			3) iterate the loop backwards
					a) print it in reverse side
					b) add each char to str variable
			4) return str
		  	
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
	 * 
	 */
	
	@Test
	public void test()
	{
		String actual = reverseStr("reverse the string");
		Assert.assertEquals(actual, "gnirts eht esrever");
	}

	public String reverseStr(String s)
	{
		String str = "";
		char[] c = new char[s.length()];
		
		for (int i = 0; i < s.length()/2; i++) // O[n/2]
		{
			
			c[i] = s.charAt(s.length()-(i+1));
			c[c.length-(i+1)] = s.charAt(i);
		
		}
		
		String ss = "";
		//string.replace(',', ' ');	
		//String newS = string.trim().replaceAll("\\s{2,}", " ");
		System.out.println(ss.valueOf(c));
		return ss.valueOf(c);
		
	}
	
}
