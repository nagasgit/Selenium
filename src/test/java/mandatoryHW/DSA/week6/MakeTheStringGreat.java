package mandatoryHW.DSA.week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeTheStringGreat 
{
	/* 1) understanding - yes
	 * 
	 * 2) Test Data:
	 * 
		 * Input: s = "leEeetcode"
		   Output: 	  "leetcode"
		 * Input: s = "aabBcC"
		 * OutPut:  =  "aa"
	 * 
	 * 3) Pseudo Code:
	 * 		- Find out the length of the string
	 * 		- Initialize the new str variable as "";
	 * 		- Iterate the char array and check i+1 - i char != 32
	 * 		- if yes, concatinate it to the new Str variable
	 * 		- else continue and return the str;
	 * 
	 */
	
	@Test
	public void test1()
	{
		String actual = strGreat("leEeetcode");
		Assert.assertEquals(actual, "leetcode");
	}
	
	
	public void test2()
	{
		String actual = strGreat("aabBcCCc");
		Assert.assertEquals(actual, "aa");
	}
	
	public String strGreat(String s)
	{
		String str = "";
		// input - leEeetcode
		//int start = 0;
	
		for (int i = 0; i < s.length()-1;) 
		{
			char a = s.charAt(i);
			char b = s.charAt(i+1);
			
			int a1 = (int) a;
			int a2 = (int) b;
			System.out.println(a1-a2);
			if (!((a - b) == 32 || (a - b) == -32))
			{
				str = str + a;
				i = i +1;
			}else {
			i = i +2;
			}
			if ((i+2) >= s.length() && (s.length()%2==0))
			{
				return str + b;
			}
		}		
		return str;
	}
}
