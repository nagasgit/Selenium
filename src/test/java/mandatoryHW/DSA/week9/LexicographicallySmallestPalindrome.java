package mandatoryHW.DSA.week9;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LexicographicallySmallestPalindrome 
{
	/* Time - O[n/2]
	 * Space - O[1]
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
	   2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: apba
		  output:  abba
		  
		  #2:
		  input: hello
		  output: heleh
		  
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			Pseudo Code:
			1) initialize left as 0 and right as length - 1 
			2) iterate the condition till left < right
				a) if left == right, left++ and right++
				b) else left < right then assign left to right
				c) else assign right to left
				d) reverse the starting after replcement, and if not equals then continue till 
				   the confition.
				e) if string matches then return the reversed string
			

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
	public void tc1()
	{
		String actual = lexiPalindrome("apba");
		Assert.assertEquals(actual, "abba");
	}
	
	@Test
	public void tc2()
	{
		String actual = lexiPalindrome("hello");
		Assert.assertEquals(actual, "heleh");
	}
	
	@Test
	public void tc3()
	{
		String actual = lexiPalindrome("hi");
		Assert.assertEquals(actual, "hh");
	}
	
	public String lexiPalindrome(String s)
	{
		int left = 0;
		int right = s.length() - 1;
		char[] cs = s.toCharArray();
		while (left < right) {
			if (cs[left] > cs[right]) {
				cs[left] = cs[right];
				left++;
				right--;
			} else {
				cs[right] = cs[left];
				left++;
				right--;
			}
		}
		return new String(cs);
	}
}
