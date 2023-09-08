package mandatoryHW.DSA.week6;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcronymofWords {
	
	/* 
	 *  O[N] - Linear Notation
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - 5 mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				 * Test Data:
				 * positive data:
				 * String[] str = {"apple","ball","cat"}, String s = "abc";
				 * return true
				 * 
				 * Positive data:
				 * String[] str = {"a","b","c"}, String s = "abc";
				 * return true
				 * 
				 * * Positive data:
				 * String[] str = {"","ba","cc"}, String s = "bc";
				 * return true
				 * 
				 * * edge case data:
				 * String[] str = {"","",""}, String s = "";
				 * return true
				 * 
				 * negative data
				 * String[] str = {"bb","dd","zz"}, String s = "bzd";
				 * return false
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
			  *  Initialize the int variable length and store the size of te
			     and String 
			  *  Initialize string variable b with the value as "".
			  *  Iterate the for loop through the string array size
			  *  and add the first character of each string in the variable b
			  *  and return true if b and string s matches 
			  */
		
			/* Problem Statement
			 * https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/submissions/
			 */

	
	@Test
	public void test1()
	{
		Boolean actual = acronymOfWords(Arrays.asList("apple","ball","cat"), "abc");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void test2()
	{
		Boolean actual = acronymOfWords(Arrays.asList("a","b","c"), "abc");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void test3()
	{
		Boolean actual = acronymOfWords(Arrays.asList("a","ba","cc"), "bc");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void test4()
	{
		Boolean actual = acronymOfWords(Arrays.asList("1","ab","a"), "aa");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void test5()
	{
		Boolean actual = acronymOfWords(Arrays.asList("bb","dd","zz"), "bzd");
		Assert.assertEquals(actual, false);
	}
	
	public Boolean acronymOfWords(List<String> words, String s) 
	{
		int length = words.size();
		String b = "";
		for (int i = 0; i <= length -1; i++) 
		{
			//char c = str[i].charAt(0);
			System.out.println(words.get(0).charAt(0));
			b = b + words.get(i).charAt(0);
		}
		return (s.equals(b));
	}
}
