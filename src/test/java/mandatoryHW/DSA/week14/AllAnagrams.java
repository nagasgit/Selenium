package mandatoryHW.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AllAnagrams {
	
	
	@Test
	public void test1() {
		List<Integer> actual = allAnagram("cbaebabacd", "abc");
		Assert.assertEquals(actual, Arrays.asList(0,6));
	}
	
	@Test
	public void test2() {
		List<Integer> actual = allAnagram("abab", "ab");
		Assert.assertEquals(actual, Arrays.asList(0,1,2));
	}
	
	@Test
	public void test3() {
		List<Integer> actual = allAnagram("ababababab", "aab");
		Assert.assertEquals(actual, Arrays.asList(0,2,4,6));
	}
	
	public List<Integer> allAnagram(String s, String p){
		//cbaebabacd
		List<Integer> list = new ArrayList<Integer>();
		
		if (p.length() > s.length())
			return list;
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length(); i++) {
			map1.put(p.charAt(i), map1.getOrDefault(p.charAt(i), 0) + 1);
		}

		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		for (int i = 0; i < p.length(); i++) {
			map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
		}
		if (map2.equals(map1)) {
			list.add(0);
		}

		for (int i = 1; i <= s.length() - p.length(); i++) {
			int val = map2.get(s.charAt(i - 1));
			if (val == 1) {
				map2.remove(s.charAt(i - 1));
			} else {
				map2.put(s.charAt(i - 1), (val - 1));
			}
			map2.put(s.charAt(i + (p.length()-1)), map2.getOrDefault(s.charAt(i + (p.length()-1)), 0) + 1);
			if (map2.equals(map1)) {
				list.add(i);
			}
		}

		return list;
	}

}
