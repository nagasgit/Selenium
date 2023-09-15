package mandatoryHW.DSA.week7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxNumOfPairs 
{

	/* 
	 * 1.Understanding the problem to detailed level (clarity on input and output, constraints)
		  Yes
		2.Frame Test data (valid, invalid, complex and edge cases)
		  Test Data:
		  #1:
		  input: words = ["cd","ac","dc","ca","zz"]
		  output:  2
		  
		  #2:
		  input: words = ["ab","ba","cc"]
		  output: 1
		3.Do you know the Solution?
		  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
		  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
		 * Pseudo Code:
				1) Input - string array
				2) Iterate the loop till array length
					a. Inner loop to iterate the word[i]
					b. Initialzie the str variable
					c. Add each char from word[i] in reverse order
				3) Word[i] is equals to reversed str, count++
				4) Iterate it till last word in the array
		  	
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
	 */
	
	@Test
	public void test1()
	{
		int actual = maxNumPairs(new String[] {"ab","ac","ba","ca","zz"});
		Assert.assertEquals(actual, 2);
		
	}
	
	@Test
	public void test2()
	{
		int actual = maxNumPairs(new String[] {"ab","zz"});
		Assert.assertEquals(actual, 0);
		
	}
	public int maxNumPairs(String[] words)
	{
		String res = "";
		int count = 0;
		int start = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {

				for (int k = words[j].length() - 1; k >= 0; k--) {
					res = res + words[j].charAt(k);
				}
				String substring = res.substring(start, res.length());
				if (words[i].equals(substring)) {
					count++;
					// res="";
				}
				start = res.length();
			}

		}
		return count;
}
}
