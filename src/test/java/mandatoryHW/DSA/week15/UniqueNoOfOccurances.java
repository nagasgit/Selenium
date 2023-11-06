package mandatoryHW.DSA.week15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UniqueNoOfOccurances {

	@Test
	public void tc1() {
		boolean actual = uniqueOccurances(new int[] {2,2,3,4});
		Assert.assertEquals(actual, false);
	}
	
	@Test
	public void tc2() {
		boolean actual = uniqueOccurances(new int[] {1,2,2,3,3,3,4,4,4,4});
		Assert.assertEquals(actual, true);
	}
	
	@Test
	public void tc3() {
		boolean actual = uniqueOccurances(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(actual, true);
	}
	
	public boolean uniqueOccurances(int[] arr) {
		
		/* Pseudo code:
		 * 1) Create a hashmap and hashset
		 * 2) iterate the arr and add all the val to map 
		 * 3) iterate the keyset and add all the values to set
		 * 3) return true if map and set size is equals else false
		 */
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<Integer> set = new HashSet<Integer>();
		
		for (int no : arr) {
			
			map.put(no, map.getOrDefault(no, 0)+1);
		}
		
		for (int key : map.keySet()) {
			int num = map.get(key);
			set.add(num);
		}		
		return (map.size() == set.size());
	}
}
