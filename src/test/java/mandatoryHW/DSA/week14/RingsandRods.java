package mandatoryHW.DSA.week14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RingsandRods {
	
	/* Pseudo Code:
	 * Create 3 hash set (red, green, blue)
	 * iterate the rings and add all the numeric values to each set
	 * iterate the seperate loop to check which set contains all the 3 colors by 
	   check the numberic value
	 * increment the count variable
	 * return count
	 * 
	 * Test Data:
	 * Input: rings = "B0B6G0R6R0R6G9"
	   Output: 1
	 */
	
	@Test
	public void tc() {
		int actual = ringRods("B0B6G0R6R0R6G9");
		Assert.assertEquals(actual, 1);
	}
	public int ringRods(String rings) {
		
		Set<Integer> red 	= new HashSet<Integer>();
		Set<Integer> green  = new HashSet<Integer>();
		Set<Integer> blue   = new HashSet<Integer>();
		
		for (int i = 0; i < rings.length(); i+=2) {
			if (rings.charAt(i) == 'R') {
				red.add(Character.getNumericValue(rings.charAt(i+1)));
			}else if(rings.charAt(i) == 'G') {
				green.add(Character.getNumericValue(rings.charAt(i+1)));
			}else if(rings.charAt(i) == 'B') {
				blue.add(Character.getNumericValue(rings.charAt(i+1)));
			}
		}
		int count = 0;
		for (int i = 0; i <= 9; i++) {
			if (red.contains(i) && green.contains(i) && blue.contains(i)) {
				count++;
			}
		}
		
		return count;
	}
}
