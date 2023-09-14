package mandatoryHW.DSA.week7;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfLinesinString 
{
	@Test
	public void test1()
	{
		int[] actual = noOfLines(new int[] {10,10,10,15,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
					10,10,10,10,10,10,10,10},"adbcefzysd");  //10+15+10+10+10+10+10+10+10+15
		Assert.assertEquals(actual, new int[] {2,15});
	}
	
	@Test
	public void test2()
	{
		int[] actual = noOfLines(new int[] {50,10,10,15,10,80,10,10,10,10,10,10,10,10,10,10,10,10,
					10,10,10,10,10,10,10,10},"adbcefzysd");  //10+15+10+10+10+10+10+10+10+15
		Assert.assertEquals(actual, new int[] {3,25});
	}
	
	public int[] noOfLines(int[] widths, String s)
	 {
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		Map <Character, Integer> alpha = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < widths.length; i++) 
		{
			if (!alpha.containsKey(alphabets.charAt(i)))
			{
				alpha.put(alphabets.charAt(i), widths[i]);
			}
		}
		System.out.println(alpha);
		int sum = 0; 
		int lines = 1;
		String str = "";
		int[] res = new int[2];
		for (int i = 0; i < s.length(); i++) 
		{
			//alpha.get(alpha)
			sum = sum + alpha.get(s.charAt(i));
			//str = str + s.charAt(i);
			if (sum > 100) {
				lines++;
				sum = alpha.get(s.charAt(i));	
				System.out.println(str);
				//str = "";
			} 		
		}
		res[0] = lines;
		res[1] = sum;	
		return res; 
	}
    }
