package mandatoryHW.DSA.week10;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

public class ValidAnagramConcurrentHash 
{
	
	@Test
	public void test1()
	{
		boolean actual = anagramUsingConcurrentHash("anagram", "nagaram");
		Assert.assertEquals(actual, true);
	}
	
	public boolean anagramUsingConcurrentHash(String s, String t)
	{
		//Concurrent hashmap can handle concurrent operations in the map, example add, remove
		//however the TC will be little high as DS will be impacted
		ConcurrentHashMap<Character, Integer> map = new ConcurrentHashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() >= 2) {
				map.remove(entry.getKey());
			}
		}
		return map.size() == 0;
	}
}
