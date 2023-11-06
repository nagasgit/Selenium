package mandatoryHW.DSA.week10;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveZeros 
{
	@Test
	public void tc1()
	{
		int[] actual = moveZeros(new int[] {1,1,1,0,0,0,1});
		Assert.assertEquals(actual, new int[] {1,1,1,1,0,0,0});
	}

	@Test
	public void tc2()
	{
		int[] actual = moveZeros(new int[] {1,0,1,1,1,1,0});
		Assert.assertEquals(actual, new int[] {1,1,1,1,1,0,0});
	}
	public int[] moveZeros(int[] nums)
	{
		 int left = 0; int right = 1; 
		 int temp;

		while (right < nums.length)
		{
		 if (nums[left] == 0 && nums[right] == 1)
			{
			temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++; right++;
		} else if (nums[left] == 0 && nums[right] == 0)
			{
			right++;
		}else {
			left++;right++;
		}
	}
		return nums;
}
}