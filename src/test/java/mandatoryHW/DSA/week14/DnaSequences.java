package mandatoryHW.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DnaSequences {

	/* 
	 * Pseudo Code:
	 * 1) Create an arraylist
	 * 2) check if string is less than 10, return list
	 * 3) iterate the loop for the window size 10 and add all the chars to Str variable
	 * 		create a map and add the str to hashmap.
	 * 4) another loop to iterate from 1 to string length - 10
	 * 5) Create a string builder to add the first chars and remove the i + 9
	 * 6) add the new string to the map.  iterate it until end of the loop.
	 * 7) iterate the keyset and if any str val is > 1 then add it to the list
	 * 8) return the list
	 * 
	 * 
	 * Test Data:
	 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
	 * Output: ["AAAAACCCCC","CCCCCAAAAA"]
	 * 
	 * //AAAAACCCCC,AAAACCCCCA,
	 */
	
	@Test
	public void tc1() {
		List<String> actual = dnaSeq("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
		Assert.assertEquals(actual, Arrays.asList("AAAAACCCCC","CCCCCAAAAA"));
	}
	
	@Test
	public void tc2() {
		List<String> actual = dnaSeq("AAAAAA");
		System.out.println(actual);
		Assert.assertEquals(actual, Arrays.asList());
	}


	public List<String> dnaSeq(String s){

		List<String> list = new ArrayList<String>();
		String str = "";
		if (s.length() < 10)
			return list;

		for (int i = 0; i < 10; i++) {
			str = str + s.charAt(i);
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put(str, map.getOrDefault(str, 0) + 1);

		for (int i = 1; i <= s.length() - 10; i++) {
			StringBuilder ss = new StringBuilder(str);
			ss.deleteCharAt(0);
			ss.append(s.charAt(i + 9));
			str = ss.toString();
			map.put(str, map.getOrDefault(str, 0) + 1);
		}

		for (String val : map.keySet()) {
			if (map.get(val) > 1) {
				list.add(val);
			}
		}
		return list;
	}
	
}
