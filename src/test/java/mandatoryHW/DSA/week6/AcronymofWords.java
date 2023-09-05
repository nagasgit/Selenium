package mandatoryHW.DSA.week6;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AcronymofWords {
	
	/* O[n]
	 * Pseudo Code:
	 * Get the string array length
	 * Initialize the string var str as "";
	 * Iterate the given array for loop to traverse each string to get the first character
	 * and adding it to the empty str variable
	 * return (Str.equals(s))
	 * else return false
	 * 
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
