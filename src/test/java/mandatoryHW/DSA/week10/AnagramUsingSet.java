package mandatoryHW.DSA.week10;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramUsingSet 
{
	/* Pseudo Code:
	 * aabc == abc
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void tc()
	{
		boolean actual = valAnagram("aabc", "bca");
		Assert.assertEquals(actual, true);
	}
	
	
	public boolean valAnagram(String s, String t) {
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			if (set.contains(t))
				return true;
		}
		
		return false;
	}
}
