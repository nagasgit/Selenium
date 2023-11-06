package mandatoryCW.DSA.week13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertionAndSelectionSort {

	/* Pseudo Code:
	 * get the length of the array
	 * have two variables, left as 0 and right as length -1
	 * while (left < right)
	 * if arr[left] < arr [right]
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void tc1() {
		int[] actual = insertionSort(new int[] {8,3,20,4});
		Assert.assertEquals(actual, new int[] {3,4,8,20});
	}

	public void tc2() {
		int[] actual = insertionSort(new int[] {3,-5,1,2});
		Assert.assertEquals(actual, new int[] {-5,1,2,3});
	}
	
	@Test
	public void tc3() {
		int[] actual = selectionSort(new int[] {20,19,-15,-1,9});
		Assert.assertEquals(actual, new int[] {-15,-1,9,19,20});
	}
	
	public int[] insertionSort(int[] nums) {
		
		int temp;
		
		for (int i = 0; i < nums.length; i++) {
			if (i+1 <= nums.length-1)
			for (int j = i+1; j > 0; j--) {
				
				if (nums[j] < nums[j-1]) {
					temp = nums[j-1];
					nums[j-1] = nums[j];
					nums[j] = temp;	
				}
			}
			
		}	
		return nums;
	}
	
	public int[] selectionSort(int[] nums) {
			
			int temp = 0; 
			//{20,19,-15,-1,9}
			for (int i = 0; i < nums.length; i++) {
				//if (i+1 <= nums.length-1)
				int minVal = i;
				for (int j = i+1; j <nums.length; j++) {	
					if (nums[minVal] > nums[j]) {
						minVal = j;
					}
				}
				 temp = nums[i];
				 nums[i] = nums[minVal];
				 nums[minVal] = temp;
				
			}	
			return nums;
		}
}
