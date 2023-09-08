package mandatoryHW.DSA.week6;

public class ReverseString {
	
	/* 
	 *   - Linear Notation
			/*
			1.Understanding the problem to detailed level (clarity on input and output, constraints) 
			   Yes - 5 mins
			
			2.Frame Test data (valid, invalid, complex and edge cases)
			    yes - 5 mins
				 * Test Data:
				 
			3. Do you know the Solution? Yes
			6. Dry run the pseudo code with all test data from step #2
				Yes - 3 mins
			7.Write the code on notepad
				Yes - 3 min
			8. Dry run the code with all test data from step #2
				Yes - 1 min
			9. Write code on IDE (remember to add comments and practice coding standards)
				4 mins		

			 /* Pseudo Code
			  * Get the input string s & int var k
			  * Initialize two int variables start as 0 and end as k;
			  * initialize the count variable as 0;
			  * iterate the loop from i(start) to str length
			  * find out the substring with start and end value and call the reverse func
			  * iterate the for loop from substring.len to start value
			  * initialize the new str variable b as ""
			  * concatinate b with each char and return b
			  * 
			  * 
			  * 
			  */
			 
			  
		
			/* Problem Statement
			 * https://leetcode.com/problems/reverse-string-ii/
			 */
	
	public String revFunc(String s, int k)
	{
		int start = 0, count = 1; int end = k;
		String res = "";
		//k = 2  s = abcdefg
		if (s.length() <= k)
			return revSubs(s);
			
		while (end < s.length()) 
		{
			//a b c d e f g
			if (count % 2 != 0) {
				res = res + revSubs(s.substring(start, end));
			}else {
				res = res + (s.substring(start, end));
			}
			
			count++;
			start = start + k;
			end = end + k;		
		}
		
		
		
		
		
		return res;
	}

	private String revSubs(String substring) 
	{
		String str = "";
		// TODO Auto-generated method stub
		for (int i = substring.length()-1; i >= 0; i--) 
		{
			str = str + substring.charAt(i);
		}
		
		return str;
	}

}
