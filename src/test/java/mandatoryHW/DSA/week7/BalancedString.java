package mandatoryHW.DSA.week7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BalancedString 
{
	/*
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: s = "RLLLRRRLRL"
		  output:  4
		  
		  #2:
		  input: s = "LLRR"
		  output:  1
		  
		  #2:
		  input: s = "LRLRLLRR"
		  output: 3
		  
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			1) Find out the length of the input string
			2) Initialize 3 variables, right, left and cnt as 0
			3) Iterate a loop till str length
				a) if character is R then right++ else increment left
				b) and if right == left then increment cnt;
			4) return cnt;
		  	
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
	 * 
	 */
	
	@Test
	public void test1()
	{
		int actual = balancedStr("LRLRLLRR");
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void test2()
	{
		int actual = balancedStr("LLRR");
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test3()
	{
		int actual = balancedStr("LLLRRRRRLL");
		Assert.assertEquals(actual, 2);
	}
	
	public int balancedStr(String s)
	{
		int right = 0;
		int left = 0;
		int cnt = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'R')
			{
				right++;
			}else {
				left++;
			}
			
			if (right == left)
				cnt++;
		}
		return cnt;
	}

}
