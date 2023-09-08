package mandatoryHW.DSA.week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MaximumNoOfWords 
{
	
	/*  	/* 
	 *  O[N] - Linear Notation
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - 2mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				 * Test Data:
					Input: String[] {"hello world", "hi how r u", "i love india"}
					Output: 4
				 * Test data 2:
				 * Input - {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
				 * Output - 6
			
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
			  * Get the String array 
			  * Initialize the maxCount & count variable as 0
			  * Iterate the array and traverse through each string
			  * Get the substring of each string and assign it to another string array
			  * iterate using foreach and get the count
			  * check if count of the string is greater than maxcount then assign the count
			  * finally return the maxcount of the string
			  */
	
		
			/* Problem Statement
			 * 
			 */
	
	@Test
	public void test1()
	{
		int maxWords = maxWords(new String[] {"hello world", "hi how r u", "i love india"});
		Assert.assertEquals(maxWords, 4);
	}
	
	@Test
	public void test2()
	{
		int maxWords = maxWords(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
		Assert.assertEquals(maxWords, 6);
	}

	 
	 public int maxWords(String[] sentences)
	 {
		 int length = sentences.length;
		 int maxCount = 0;
		 
		 for (int i = 0; i < sentences.length; i++) 
		 {
			 int count = 0;
			 String[] split = sentences[i].split(" ");
			 for (String eachStr : split) 
			 {
				System.out.println(eachStr);
				count++;
			 }
			 if (count > maxCount) {
				 maxCount = count;
			 }
			
		 }
				  
		 return maxCount;
	 }

}
