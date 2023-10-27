package mandatoryHW.DSA.week13;

import org.checkerframework.checker.units.qual.min;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortColors {

	/* Pseudo Code:
	 * 1) Get the length of the arr
	 * 2) Iterate the loop till arr length
	 * 3) int minVal = i
	 * 4) iterate the loop from i+1 till length
	 * 5) 
	 * 
	 * 
	 * Input: nums = [2,0,2,1,1,0]
	   Output: [0,0,1,1,2,2]
	 * 1) 0,2,2,1,1,0
	 * 2) 0,0,2,1,1,2
	 * 3) 0,0,1,2,1,2
	 * 4) 
	 * 
	 * 
	 */
	
	@Test
	public void tc1() {
		int[] actual = inPlaceSort(new int[] {2,0,2,1,1,0});
		Assert.assertEquals(actual, new int[] {0,0,1,1,2,2});
	}
	
	public int[] inPlaceSort(int[] nums) {
		
		int minVal; int temp;
		for (int i = 0; i < nums.length; i++) {
				minVal = i;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[minVal] > nums[j])
					minVal = j;
			}
			
			temp = nums[i];
			nums[i] = nums[minVal];
			nums[minVal] = temp;
		}
		
		return nums;
	}
}
