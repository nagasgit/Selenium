package mandatoryHW.DSA.week12;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.object.HasEqualValues;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstUniqueChars {
	
	/* Pseudo Code:
	 * 1) Create a hashmap
	 * 2) iterate the string and add it to the map
	 * 3) another loop to check the first unique chars. for
	 * 	  which the value is 1. 
	 * 
	 */
	
	@Test
	public void tc1() {
		int actual = firstUniqChar("leetcode");
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void tc2() {
		int actual = firstUniqChar("loveleetcode");
		Assert.assertEquals(actual, 2);
	}
	
	@Test
	public void tc3() {
		int actual = firstUniqChar("aabb");
		Assert.assertEquals(actual, -1);
	}
	public int firstUniqChar(String s) {
        Map<Character, Integer> uniqueChars = new HashMap<Character, Integer>();
		
        for (char c : s.toCharArray()) {
			uniqueChars.put(c, uniqueChars.getOrDefault(c, 0)+1);
		}
        
        for (int i = 0; i < s.length(); i++) {
			if (uniqueChars.get(s.charAt(i)) == 1) {
				return i;
			}
		}
        return -1;
    }

}
