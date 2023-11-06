package mandatoryHW.DSA.week14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeros {

	/* 
	 * https://leetcode.com/problems/move-zeroes/description/
	 * Pseudo Code:
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Test
	public void tc1() {
		int[] actual = moveZeros(new int[] {0,1,0,3,12});
		Assert.assertEquals(actual, new int[] {1,3,12,0,0});
	}
	
	@Test
	public void tc2() {
		int[] actual = moveZeros(new int[] {0,0,0,0,12});
		Assert.assertEquals(actual, new int[] {12,0,0,0,0});
	}
	
	@Test
	public void tc3() {
		int[] actual = moveZeros(new int[] {0});
		Assert.assertEquals(actual, new int[] {0});
	}
	
	public int[] moveZeros (int[] nums) {
		
		int temp;
		int s = 0;
		int e = 1;
		while (s < nums.length && e < nums.length) {
			if (nums[s] == 0 && nums[e] == 0) {
				e++;
			} else if (nums[s] == 0 && nums[e] != 0) {
				temp = nums[s];
				nums[s] = nums[e];
				nums[e] = temp;
				s++;
				e++;
			} else {
				s++;
				e++;
			}
		}
		return nums;
	}
}
