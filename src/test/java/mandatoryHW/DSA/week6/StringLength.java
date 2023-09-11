package mandatoryHW.DSA.week6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringLength 
{
	
	@Test
	public void test()
	{
		String actual = test1("hey");
		Assert.assertEquals(actual, "hey");
	}
	public String test1(String sentence)
	{
		if (sentence.length() > 1)
		{
			   String[] splitStr = sentence.split(" ");
		        int max = 1; int k;
		        String maxWord = " ";
		        
		        for (int i = 0; i < splitStr.length; i++)
		        {
		            k = splitStr[i].length();
		            if (k % 2 == 0 && k > maxWord.length())
		            {
		                max = k;
		                maxWord = splitStr[i];
		            }
		        }
		        return maxWord;
		}
		 return null;
	     
	    }
		
	}
