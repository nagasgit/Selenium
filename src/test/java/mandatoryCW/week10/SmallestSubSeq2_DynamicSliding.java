package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestSubSeq2_DynamicSliding {
	
	/*
	 * Pseudo Code:
	 * Initialize variable - > min as Integer.max
	 * Iterate the loop till arra length
	 * inner loop to iterate each value
	 * 	calculate the sum and check until its greater than k
	 * if > k then, save the count
	 * check if count is greater than min, if not assign count to min
	 * iterate it until find the smallest subsequence
	 * 
	 */
	
	@Test
	public void tc()
	{
		int actual = smallSubSeq(new int[] {1,2,3,4,5}, 10);
		Assert.assertEquals(actual, 3);
	}
	
	public int smallSubSeq(int[] arr, int k)
	{
		int currentsum = 0;
		int left = 0, right = 0; int output = -1;
		//int i = left;
		while (right <= arr.length)
				{
			if (currentsum > k) {
				output = Math.max(output, right-left);
				currentsum-=arr[left];
				left++;
				
			}else {
				if (right == arr.length)
					break;
				currentsum+=arr[right];
				right++;
			}
		}		
		return Math.min(output, right-left+1);
	}

}
