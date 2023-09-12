package mandatoryHW.DSA.week7;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FaultyKeyboard 
{
	/*  1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: s = "pointer"
		  output:  opnter
		  
		  #2:
		  input: s = "hifi"
		  output: fh
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			1) get the input string
			2) initialize the str variable as ""
			3) iterate the string till the length
				a) check if each char matches with i
					a1) if matches, inner for loop to iterate it reverse and add it to str
					    variable
				b) continue to add the remaining str
			4) return the string
		  	
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
		String actual = faultyKeyboard("pointir");
		Assert.assertEquals(actual, "tnpor");
	}
	
	@Test
	public void test2()
	{
		String actual = faultyKeyboard("tpictiop");
		Assert.assertEquals(actual, "tctpop");
	}

	public String faultyKeyboard(String s)
	{
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < s.length(); i++) 
		{
			//char[] cs = new char[start];
			if (s.charAt(i) != 'i') 
			{
				output.append(s.charAt(i));
			} else {
				output.reverse();
			}
			}
			
		return output.toString();
	}
}
