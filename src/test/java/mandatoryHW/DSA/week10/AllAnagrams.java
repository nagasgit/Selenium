package mandatoryHW.DSA.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllAnagrams 
{
	/*
	 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. 
	 * You may return the answer in any order.  An Anagram is a word or phrase formed by 
	 * rearranging the letters of a different word or phrase, typically using all the original 
	 * letters exactly once.
	 * Input:  s = "cbaebabacd", p = "abc"
	   Output: [0,6]
	   
	 * Pseudo Code:
	 * 1) Create a hash map
	 * 2) Iterate the loop till p length
	 * 		a) add all the chars to the map.
	 * 3) Initialize variables => left and right as 0
	 * 4) iterate the loop using while till left is lesser than right
	 * 5) check if map contains the chars, then add else ignore
	 * 6) check the map size after each loop and save the left indices
	 * 
	 * 
	 */
	
	@Test
	public void tc1()
	{
		Integer[] actual = findAnagrams("cbaebabacd", "abc");
		Assert.assertEquals(new int[] {0,6}, actual);
		
	}
	
	public Integer[] findAnagrams(String s, String p)
	{
		Map<Character, Integer> sStr1 = new HashMap<Character, Integer>();
		Map<Character, Integer> pStr2 = new HashMap<Character, Integer>();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < p.length(); i++) 
			{
				sStr1.put(p.charAt(i), sStr1.getOrDefault(p.charAt(i), 0)+1);
				pStr2.put(s.charAt(i), pStr2.getOrDefault(s.charAt(i), 0)+1);			
			}
		if (pStr2.equals(sStr1))
			res.add(0);

		int left = 1;
		while (left <= (s.length()-p.length())) 
			{
			sStr1.put(s.charAt(left-1), sStr1.getOrDefault(s.charAt(left-1), 0)-1);
			if (sStr1.get(s.charAt(left-1))==0)
				sStr1.remove(s.charAt(left-1));
			sStr1.put(s.charAt(p.length()-1+left), sStr1.getOrDefault(s.charAt(p.length()-1+left), 0)+1);
			if (sStr1.equals(pStr2))
			res.add(left);
			left++;
			}	
			Integer[] arr = new Integer[res.size()];
		
		return res.toArray(arr);
	}
}
