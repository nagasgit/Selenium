package mandatoryHW.DSA.week10;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidAnagramUsingHash 
{
/*
 * Pseudo Code:
 * 1) Create a hashmap
 * 2) iterate a loop till length
 * 		a) add all the chars of s as well as p
 * 3) iterate the loop till p.length
 * 		b) decrement the index positions and check if map is empty or contains values
 * 4) if map contains values then not an anagram, else its anagram
 * 
 */
	
	@Test
	public void tc1()
	{
		boolean actual = validAnagram("anagram", "nagaram");
		Assert.assertEquals(actual, true);
	}
	
	public boolean validAnagram(String s, String p)
	{

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		for (int i = 0; i < p.length(); i++) {
			if (map.containsKey(p.charAt(i))) {
				int val = map.get(p.charAt(i));
				if (map.get(p.charAt(i)) == 1)
					map.remove(p.charAt(i));
				else
					map.put(p.charAt(i), val - 1);
			} else {
				map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);
			}
		}
		if (map.size() == 0) {
			return true;
		}

		return false;
	}
}
