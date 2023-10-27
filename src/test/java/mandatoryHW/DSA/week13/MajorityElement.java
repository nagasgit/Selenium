package mandatoryHW.DSA.week13;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityElement {

	/* Pseudo Code:
	 * 1) Create a map
	 * 2) iterate it using for loop and add all the array eles into map
	 * 3) another forloop to check if value of any of the keys is greater than
	 * 	  (len of array / 2), increment the count variable.
	 * 4) return count.
	 * 
	 * Test Data:
	 * #1	I/p - [3,2,3]
	 * 		o/p - 3
	 * 
	 * #2	I/p - [2,2,1,2,2,2,1,1,1,1]
	 * 		o/p - 2
	 * 
	 * 
	 */
	
	@Test
	public void tc1() {
		int actual = majorityEles(new int[] {3,2,3});
		Assert.assertEquals(actual, 3);
	}
	
	@Test
	public void tc2() {
		int actual = majorityEles(new int[] {2,2,1,2,2,2,1,1,1});
		Assert.assertEquals(actual, 2);
	}
	
	public int majorityEles(int[] nums) {
		
		Map<Integer, Integer> ele = new HashMap<Integer, Integer>();
		
		for (int i : nums) {
			ele.put(i, ele.getOrDefault(i, 0)+1);
		}
		
		for (int j : ele.keySet()) {
			int val = ele.get(j);
			if (val > (nums.length/2)) {
				return j;
			}
		}
		return 0;
	}
}
