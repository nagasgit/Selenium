package mandatoryHW.DSA.week4;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5_AssignCookies_Updated 
{
	/*
	 * 	// O[N] - Linear Notation
	
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - 5 mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				POsitive data1:  
				input 1 = {2,3,4}
				input 2 = {1,2}
				Positive data2:    
				input 1 = {9,5,7,3,2}
				input 2 = {6,8}
				Negative data:    
				input 1 = {5,6}
				input 2 = {7,8}
				Edge Case:
				input 1 = {1}
				input 2 = {-2}		
			3. Do you know the Solution? Yes
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 3 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				4 mins		
		 */
		
			/* Problem Statement
			 * https://leetcode.com/problems/assign-cookies/
			 */
		
	 /* 
	 * Pseudo Code
	 * Get the array inputs - number of childs and size of the cookies
	 * Sort the child array and initialize the variable count with 0
	 * for loop to traverse the cookies
	 * inner for loop to traverse each child
	 * if cookies size[i] > childgreedyfactor[j]
	 * if greater than count++; break
	 * loop through all the cookie size
	 * return the count;	 * 
	 * 
	 */
	
	//@Test
	public void test1()
	{
		int actual = assignCookies(new int[] {9,5,7,3,2}, new int[] {6,8});
		Assert.assertEquals(actual, 2);
	}
	
	//@Test
	public void test2()
	{
		int actual = assignCookies(new int[] {2,3,4}, new int[] {1,2});
		Assert.assertEquals(actual, 1);
	}
	
	//@Test
	public void test3()
	{
		int actual = assignCookies(new int[] {7,8}, new int[] {5,6});
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void test4()
	{
		int actual = assignCookies(new int[] {10,9,8,7}, new int[] {5,6,7,8});
		Assert.assertEquals(actual, 2);
	}
	
	public int assignCookies(int[] child, int[] cSize)
	{
		int count = 0; int content = 0;
		Arrays.sort(child);
		for (int i = 0; i < cSize.length; i++) 
		{
			for (int j = 0; j < child.length; j++) 
			{
				if((cSize[i] >= child[j]) && (cSize[i] != content))
				{
					count++;
					content = cSize[i];
					child[j] = ' ';
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(child));
		return count;
	}
	

}
