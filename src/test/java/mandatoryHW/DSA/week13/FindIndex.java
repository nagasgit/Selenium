package mandatoryHW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindIndex {

	
	@Test
	public void tc1() {
		int actual = findIndex(new int[] {1,3,5,6}, 2);
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void tc2() {
		int actual = findIndex(new int[] {1,3,5,6}, 7);
		Assert.assertEquals(actual, 4);
	}
	
	@Test
	public void tc3() {
		int actual = findIndex(new int[] {1,3,5,6}, 5);
		Assert.assertEquals(actual, 2);
	}
	
	public int findIndex(int[] nums, int target) {
		
		int left = 0; int right = nums.length-1;
		int mid = 0;
		
		if (target == 0) return 0;
		if (target > nums[right]) return right+1;
		
		while (left < right) {
			mid = left + (right-left)/2;
			
			if (nums[mid] == target) {
				return mid;
			}else if (nums[mid] > target) {
				right = mid - 1;
			}else {
				left = mid + 1;		
			}
		}	
		return mid;
	}
}
