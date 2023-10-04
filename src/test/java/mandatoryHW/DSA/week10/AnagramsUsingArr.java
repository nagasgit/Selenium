package mandatoryHW.DSA.week10;

import java.util.Iterator;

import org.testng.annotations.Test;

public class AnagramsUsingArr 
{
	/*
	 * Pseudo Code:
	 * 1) Create an array with the size of 26
	 * 2) Iterate using for loop
	 * 		a) add all the s chars to the array
	 * 3) another for loop
	 * 		b) remove the chars from the array
	 * 4) check if any chars contains value of -1, return false else true.
	 * 
	 * 
	 */
	
	@Test
	public void tc1() {
		boolean actual = validAnagram("anagram", "nagaram");
	}
	
	
	public boolean validAnagram(String s, String t)
	{
		short[] c = new short[26];
		for (char ch : s.toCharArray()) {
			c[ch -'a']++;
		}
		
		for (char ch : t.toCharArray()) {
			c[ch-'a']--;
		}
		
		for(int i : c) {
			if (i!=0) {
				return false;
			}
		}
		
		return true;
	}
}
