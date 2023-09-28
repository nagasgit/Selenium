package mandatoryCW.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmallestSubSeq {
	
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
		int sum = 0; int min = Integer.MAX_VALUE;int count = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			count = 0;sum=0;
			for (int j = i; j < arr.length; j++) {
				
				sum = sum + arr[j];
				count++;
				if ((sum > k) && (count < min))
				{
					min = count;
					break;
				}
			}
			
		}
		return min;
	}

}
