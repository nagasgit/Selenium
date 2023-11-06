package mandatoryHW.DSA.week12;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUniqueChars {

	@Test
	public void tc() {
		int actual = uniqueChars("statistics");
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void tc1() {
		int actual = uniqueChars("hakcthegame");
		Assert.assertEquals(actual, 3);
	}
	
	public int uniqueChars(String s) {
		
		/* Pseudo Code:
		 * 1) Find out the string length
		 * 2) create a hashmap and iterate & add all chars to the map
		 * 3) another forloop to check the value the value is equals to 1 then return i;
		 */
		
		Map<Character, Integer> unique = new HashMap<Character, Integer>();
		
		for (char c : s.toCharArray()) {
			unique.put(c, unique.getOrDefault(c, 0)+1);
		}
		
		for (int i = 0; i < s.length(); i++) {
			if (unique.get(s.charAt(i)) == 1) {
				return i+1;
			}
		}
		return -1;
	}
}
