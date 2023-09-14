package mandatoryHW.DSA.week7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseWords 
{
	/*  1.Understanding the problem to detailed level (clarity on input and output, constraints)
	  Yes (2 mins)
		2.Frame Test data (valid, invalid, complex and edge cases)
	  Test Data:
		  #1:  
		  input: Let's take LeetCode contest
		  output:  s'teL ekat edoCteeL tsetnoc
		  
		  #2:
		  input: God Ding
		  output: doG gniD
	  
		3.Do you know the Solution?
	  yes
		4.Do you have any alternate approaches? (Thing of alternate approaches)
	  yes
		5.Derive Pseudo code in paper (for the best chosen approach)
			1) split the string with " "
			2) find out the string array length
			3) iterate each word of the string
				- initialize the str variable as " ";
				- add each char to the str variable
			4) Create an array with string array length
			5) add space to the str before next iteration
			6) return the str
				
	       
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
	public void test1()
	{
		String actual = reverseWords("Let's take LeetCode contest");
		Assert.assertEquals(actual, "s'teL ekat edoCteeL tsetnoc");
	}
	
	@Test
	public void test2()
	{
		String actual = reverseWords("god will help");
		Assert.assertEquals(actual, "dog lliw pleh");
	}
	
	@Test
	public void test3()
	{
		String actual = reverseWords("oppo");
		Assert.assertEquals(actual, "oppo");
	}
	
	@Test
	public void test4()
	{
		String actual = reverseWords("");
		Assert.assertEquals(actual, "");
	}

	public String reverseWords(String s)
	{
		String[] split = s.split(" ");
		String[] res = new String[split.length];
		String str = "";
		
		for (int i = 0; i < split.length; i++) 
		{
			for (int j = split[i].length()-1; j >= 0; j--) 
			{
				str = str + split[i].charAt(j);				
			}
			str = str + " ";
			System.out.println(str);
		}
		
		return str.trim();
	}
}
