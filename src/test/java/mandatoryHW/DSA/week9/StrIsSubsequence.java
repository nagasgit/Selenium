package mandatoryHW.DSA.week9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StrIsSubsequence {
	/* Time - 
	 * Space - 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: 
		  output:  
		  
		  #2:
		  input: 
		  output: 
		  
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
				1) Initialize variables s1 as 0 and t1 as 0, count as 0
				2) Iterate it using while till the s and t length
					a) check the chars in s is equals in t, if yes
						s1++; t1++; count++
					b) if not equals to then t1++
				3) return true if count == s.length

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
		boolean actual = strSubs("abc", "afdbsc");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc1()
	{
		boolean actual = strSubs("abbc", "afdbsc");
		Assert.assertEquals(actual, false);
	}
	
	public boolean strSubs(String s, String t)
	{
		int s1 = 0, t1 = 0;int count = 0;
		
		while (s1 < s.length() && t1 < t.length())
		{
			if (s.charAt(s1) == t.charAt(t1))
			{
				s1++;t1++;count++;
			} else {
				t1++;
			}
		}
		return count == s.length();
	}
}
