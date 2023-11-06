package mandatoryHW.DSA.week14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LongPressedName {

	/* https://leetcode.com/problems/long-pressed-name/
	 * 
	 * Pseudo Code:
	 * 1) Create a hashmap
	 * 2) iterate the typed string using loop and add it to the map.
	 * 3) iterate the name string using loop and remove the char from map
	 * 4) if map does not contain the name chars, return false
	 * 5) else return true
	 */
	
	
	public void tc1() {
		boolean actual = longPressedName("alex", "aaleex");
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc2() {
		boolean actual = longPressedName("saeed", "ssaaedd");
		Assert.assertEquals(actual, false);
	}
	
	public boolean longPressedName(String name, String typed) {
		Map<Character, Integer> s = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < typed.length(); i++) {
			s.put(typed.charAt(i), s.getOrDefault(typed.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < name.length(); i++) {
			
			if (s.containsKey(name.charAt(i))) {
				int val = s.get(name.charAt(i));
				s.put(name.charAt(i), val-1);
				if (s.get(name.charAt(i)) == 0) {
					s.remove(name.charAt(i));
				}
			}else {
				return false;
			}
		}		
		return true;
	}
}
