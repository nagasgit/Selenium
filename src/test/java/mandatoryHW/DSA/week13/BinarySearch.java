package mandatoryHW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearch {

	@Test
	public void tc1() {
		int actual = binarySearch(new int[] {-1,0,3,5,9,12}, 9);
		Assert.assertEquals(actual, 4);
	}
	
	public int binarySearch(int[] nums, int target) {

		int left = 0;
		int right = nums.length - 1;
		int mid;
		if (nums.length == 1 && nums[right] == target)
			return right;
		if (nums.length == 1 && nums[right] != target)
			return -1;

		while (left <= right) {
			mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;

	}
}
