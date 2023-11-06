package mandatoryCW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearch {

	/* Pseudo Code:
	 *  1) Get the input array and target element
	 *  2) Initiate variable => left = 0, right = len-1;
	 *  3) while (left <= right)
	 *  4) int mid = len/2
	 *  5) if mid < target, left = mid+1
	 *  6) if mid > target, right = mid -1
	 *  7) return mid, if any of the conditions matches with target value
	 * 
	 * 
	 * Data:
	 * #1
	 * i/p = [120, 130, 140,150,160], Target = 130
	 * o/p = 1
	 */
	
	public void test1() {
		int actual = searchAlgorithm(new int[] {120,130,140,150,160}, 130);
		Assert.assertEquals(actual, 1);
	}
	
	@Test
	public void test2() {
		int actual = searchAlgorithm(new int[] {-1,5,6,9,10}, 10);
		Assert.assertEquals(actual, 4);
	}
	
	public int searchAlgorithm(int[] nums, int target) {
		
		int left = 0; int right = nums.length-1;
		
		while (left <= right) {
			
			int mid = left + (right-left)/2;	
			if (nums[mid] == target) {
				return mid;
			}else if (nums[mid] > target) {
				right = mid -1;
			}else {
				left = mid+1;
			}
			
		}
		return -1;
	}
	
	
	
}
