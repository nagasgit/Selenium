package mandatoryHW.DSA.week15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MajorityEle_O1Spacecomplexity {
	/*
	 * Pseudo Code:
	 * 1) assign the first val as majority ele and add count variable as 1
	 * 2) Itearte the loop till nums array length from 1
	 * 3) check if (nums[i] == majorityele) count++
	 * 4) else if(count == 0), majorityele = nums[i]; count = 1;
	 * 5) else count--;
	 * 
	 * verify if majority element is indeed majority ele
	 * 6) iterate another loop to check nums which is matching with majorityele and
	 * 	  increment the counter;
	 * 7) if count > nums.len/2; return majorityele;
	 */
	
	
	public void tc1() {
		int actual = majorityEle(new int[] {2,2,1,1,2});
		Assert.assertEquals(actual, 2);
	}
	
	
	public void tc2() {
		int actual = majorityEle(new int[] {2,2,1,1});
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	public void tc3() {
		int actual = majorityEle(new int[] {6,5,5});
		Assert.assertEquals(actual, 5);
	}
	
	//Time - O[n], Space - O[1];
	public int majorityEle(int[] nums) {
		
		int majorityEle = nums[0];
		int count = 1;

		for (int i = 1; i < nums.length; i++) {
			if (count == 0) {
				majorityEle = nums[i];
				count = 1;
			} else if (nums[i] == majorityEle) {
				count++;
			} else {
				count--;
			}
		}

		count = 0;
		for (int no : nums) {
			if (no == majorityEle) {
				count++;
			}
		}

		if (count > (nums.length / 2)) {
			return majorityEle;
		}
		
		return 0;
	}
	
}
