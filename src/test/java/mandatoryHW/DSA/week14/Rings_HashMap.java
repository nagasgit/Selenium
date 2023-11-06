package mandatoryHW.DSA.week14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class Rings_HashMap {
	
	@Test
	public void tc1() {
		rings("B0B6G0R6R0R6G9");
	}

	public int rings(String rings) {
		
		Map<Character, Set<Character>> map = new HashMap<Character, Set<Character>>();

		for (int i = 1; i < rings.length(); i += 2) {
			if (!map.containsKey(rings.charAt(i))) {
				map.put(rings.charAt(i), new HashSet<Character>());
			}
			map.get(rings.charAt(i)).add(rings.charAt(i - 1));
		}
		int count = 0;
		for (char ch : map.keySet()) {
			if (map.get(ch).size() == 3) {
				count++;
			}
		}
		return count;
	}
}
