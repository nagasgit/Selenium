package mandatoryHW.week3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day5 {

	/*
	 *  1.Understanding the problem to detailed level (clarity on input and output, constraints)
		2.Frame Test data (valid, invalid, complex and edge cases)		
		3.Do you know the Solution?		
		4.Do you have any alternate approaches? (Thing of alternate approaches)	
		5. Derive Pseudo code in paper (for the best chosen approach)
		     Use ChatGPT to get approach or hints not the entire solution or complete code. 
		     USE THIS ONLY WHEN YOU ARE UNABLE TO GET THE APPROACH  
		     FOR A GIVEN PROBLEM AFTER APPLYING ALL WHAT YOU HAVE LEARNT AND PRACTICED + 
		     Remember how your brain is converting the test data input to its expected output!	
		6. Dry run the pseudo code with all test data from step #2
		7.Write the code on notepad	
		8. Dry run the code with all test data from step #2	
		9. Write code on IDE (remember to add comments and practice coding standards)	
		10.Test the code + Debug the code (if any failures) Debug like a pro using debugging options of IDE
		11. Check for any gaps of code optimization (if not optimized already in Step #9)
	 */
	
	/*Problem Statement:
	 * Find if no is spy number a number whose sum of digits of is equal to the product 
	 * of its digits is called Spy number	 * 
	 * 
	 * TEst Date:
	 *  Positive data - 132 
	 *  	sum = 1 + 3 + 2 (6)
	 *  	product = 1*3*2 (6)
	 *  
	 *  Positive data 2 - 1124
	 *   sum = 8
	 *   product = 8
	 *   
	 *   Negative data - 11
	 *   sum = 2
	 *   product = 1
	 */
	
	/*
	 * Pseudo code:
	 * 1) Get the inputs 
	 * 2) check if the given int is greater than 9, if not return false
	 * 3) if greater than 9, then initialize two variables to get the reminder and quotient
	 * 4) sum = sum + rem
	 * 5) product = product * rem
	 * 6) if sum == product then return true else false	 * 	
	 */
	@Test
	public void test1()
	{
		boolean spy = isSpy(132);
		Assert.assertEquals(spy, true);
	}
	
	@Test
	public void test2()
	{
		boolean spy = isSpy(1124);
		Assert.assertEquals(spy, true);
	}
	
	@Test
	public void test3()
	{
		boolean spy = isSpy(11);
		Assert.assertEquals(spy, false);
	}
	
	public boolean isSpy(int num)
	{
		if (num <= 9)
			return false;
		int sum = 0;
		int product = 1;
		int rem;
		//132
		while (num > 0)
		{
			rem = num % 10;  //2
			sum = sum + rem;
			product = product * rem;
			num = num / 10;
		}
		if (sum == product) {
			return true;
		}
		return false;
	}
	
	
}
