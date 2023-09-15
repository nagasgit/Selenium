package mandatoryHW.DSA.week7;

import org.testng.annotations.Test;

public class EqualDigitCnt 
{
	/*
	 * Pseudo Code:
	 * 1) Convert the string to char array
	 * 2) Iterate the first loop till string length
	 * 		a) iterate another loop with the same length and count the occurance
	 * 		b) Check if i and count matching, continue
	 * 		c) else return false 
	 */
	
	@Test
	public void test1()
	{
		boolean actual = equalDigi("1210");
	}

	@Test
	public void test2()
	{
		boolean actual = equalDigi("1210");
	}
	public boolean equalDigi(String s)
	{
		char[] cs = s.toCharArray();
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			count = 0;
			for (int j = 0; j < s.length(); j++) 
			{
				
				if (i == Character.getNumericValue(s.charAt(j)))
				{
					count++;
				}
			}
			if (Character.getNumericValue(cs[i]) == count)
			{
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}
