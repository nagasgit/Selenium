package mandatoryHW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountOnes {

	/* Pseudo Code
	 * 1) Initialize variables -> left - 0, right - len-1
	 * 2) Check whether left less than right
	 * 3) mid = left + (right-left)/2;
	 * 4) if (nums[mid] >= 1), right = mid -1
	 * 5) else if  (nums[mid] < 1), left = mid + 1
	 */
	
	@Test
	public void tc1() {
		int actual = countOnes(new int[] {0,1,1,1,1,1});
		Assert.assertEquals(actual, 5);
	}
	
	public int countOnes(int[] nums) {
		
		int left = 0; 
		int right = nums.length-1;
		
		while (left < right) {
			int mid = left + (right-left)/2;	
			if (nums[mid] == 1) {
				right = mid - 1;
			}else if (nums[mid] < 1) {
				left = mid + 1;
			}
		}		
		return (nums.length-left);
	}
}
