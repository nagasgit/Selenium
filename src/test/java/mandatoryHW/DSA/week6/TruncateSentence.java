package mandatoryHW.DSA.week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TruncateSentence 
{
	/*
	 * /*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - 2mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				 * Test Data:
					Input: Str = "hi how r u", int k = 2
					Output: "hi how"
				 * Test data 2:
				 * Input - Str = "i love india", int k = 1
				 * Output - "i"
			
			3. Do you know the Solution? Yes
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 3 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				4 mins		
				
					 /* 
			 /* Pseudo Code
			  * get the input string and int k
			  * initialize the str variable res = " ";
			  * find out the length of the string and iterate it using for loop
			  * for loop to traverse from 0 to k in the string array and add it to res variable
			  * return res
			  */
			  
	
		
			/* Problem Statement
			 * 
			 */
	
	@Test
	public void test1()
	{
		String actual = truncateSen("hi how r u", 2);
		Assert.assertEquals(actual, "hi how");
	}
	
	public String truncateSen(String s, int k)
	{
		int length = s.length();
		String res = "";
		String[] split = s.split(" ");
		for (int i = 0; i < k; i++) 
		{
		res = res + split[i]+ " ";	
		}
		
		return res.trim();
	}

}
