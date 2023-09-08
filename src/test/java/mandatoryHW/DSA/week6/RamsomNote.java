package mandatoryHW.DSA.week6;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RamsomNote {
	
	/* understanding - yes
	 * 
	 * Test data:
	 * Example 1:

		Input: ransomNote = "a", magazine = "b"
		Output: false
		Example 2:
		
		Input: ransomNote = "aa", magazine = "ab"
		Output: false
		Example 3:
		
		Input: ransomNote = "aa", magazine = "aab"
		Output: true
	 * 
	 * Pseudo Code:
		1) if megazine leng is lesser than ramsomnote return false
		2) for loop to iterate through ramsome note
		2) inner for loop to interate through megazine leng
		3) if megz char matches with first char of ramsomnote then add it to the newstr and break;
		4) else continue
		5) 
	 * 
	 * 
	 */
	
	@Test
	public void test1()
	{
		boolean actual = ramsomN("aa", "aab");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void test2()
	{
		boolean actual = ramsomN("a", "b");
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void test3()
	{
		boolean actual = ramsomN("aab", "baa");
		Assert.assertEquals(actual, true);
	}
	
	public boolean ramsomN(String ransomNote, String magazine) {
		char[] charArray = ransomNote.toCharArray();
		Arrays.sort(charArray); // nlogn
		char[] charArray1 = magazine.toCharArray();
		Arrays.sort(charArray1);
		String newStr = "";
		if (ransomNote.length() > magazine.length())
			return false;
		// int start = 0;
		for (int i = 0; i < charArray.length; i++) // O[n]
		{
			for (int j = i; j < charArray1.length; j++) // O[m]
			{
				if (charArray1[j] == charArray[i]) {
					newStr = newStr + charArray1[j];
					break;
				}
			}
			String res = String.valueOf(charArray);
			if (newStr.equals(res)) {
				return true;
			}
		}
		return false;
	}

}
